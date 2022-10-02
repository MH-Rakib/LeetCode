package org.example.leetcodeSolutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem7 {

    public List<Integer> getTestCases(){
        List<Integer> testCases = new ArrayList<>();
        testCases.add(123);
        testCases.add(-99999999);
        testCases.add(-1);
        testCases.add(-56);
        testCases.add(-651519999);
        return testCases;
    }

    public int reverse(int x) {
        try {
            if (x < 0){
                StringBuilder resultString = new StringBuilder(String.valueOf(x*-1));
                int reverseResult = Integer.parseInt(resultString.reverse().toString());
                return reverseResult * -1;
            } else {
                StringBuilder resultString = new StringBuilder(String.valueOf(x));
                int reverseResult = Integer.parseInt(resultString.reverse().toString());
                return reverseResult;
            }
        } catch (NumberFormatException e){
            return (int) 0;
        }
    }
}
