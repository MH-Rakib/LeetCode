package org.example.leetcodeSolutions;

import java.util.ArrayList;
import java.util.List;

public class Problem6 {

    public List<String> getTestCase(){
        List<String> testCases = new ArrayList<>();
        testCases.add("PAYPALISHIRING");
        testCases.add("AB");
        return testCases;
    }

    public String convert(String s, int numRows) {

        // Base case
        if(s.length() == 1){
            return s;
        }

        StringBuilder[] sb = new StringBuilder[numRows];

        for(int i = 0; i< sb.length; i++){
            StringBuilder stringBuilder = new StringBuilder();
            sb[i] = stringBuilder;
        }

        int direction = 0;
        int currentRow = 0;

        for(int i = 0; i<s.length(); i++){

            char c = s.charAt(i);
            currentRow = currentRow + direction;
            sb[currentRow].append(c);

            if(numRows == 1){
                currentRow = 0;
            } else if (currentRow == 0 || currentRow == numRows-1) {
                direction = (direction == 0) ? 1 : (direction*-1);
            }
        }

        StringBuilder result = new StringBuilder();

        for(int i = 0; i<sb.length; i++){
            result.append(sb[i]);
        }
        return result.toString();
    }
}
