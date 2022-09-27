package org.example.leetcodeSolutions;


import java.util.ArrayList;
import java.util.List;

public class Problem8 {

    public List<String> getTestCases(){
        List<String> testCases = new ArrayList<>();
        testCases.add("42");
        testCases.add("    -42a");
        testCases.add(" 42 with word");
        testCases.add(" --42 aassa");
        testCases.add("aa --+42 aassa");
        testCases.add("-91283472332");
        testCases.add("9991283472332");
        testCases.add("+-12");
        testCases.add("+--  -12");
        testCases.add("00000-42a1234");
        testCases.add("   +0 123");
        testCases.add("9223372036854775808");
        testCases.add("   -42");
        testCases.add("  +  413");
        testCases.add("9223372036854775809");
        testCases.add("-91283472332");
        testCases.add("-2147483647");
        return testCases;
    }

    public int myAtoi(String s) {

        char sign = '+' ;
        long result = 0;

        boolean isDigitExist = false;
        boolean isSignExist = false;

        char[] stringToCharArray = s.toCharArray();

        for(int i = 0; i< stringToCharArray.length; i++){

            char currentIndexValue = stringToCharArray[i];

            if(currentIndexValue == ' '){
                if(isDigitExist){
                    break;
                } else if (isSignExist) {
                    break;
                }
                continue;
            }

            if(currentIndexValue == '+'){
                if(isSignExist){
                    break;
                } else if (isDigitExist) {
                    break;
                } else {
                    sign = '+';
                    isSignExist = true;
                    continue;
                }
            }

            if(currentIndexValue == '-'){
                if(isSignExist){
                    break;
                } else if (isDigitExist) {
                    break;
                } else {
                    sign = '-';
                    isSignExist = true;
                    continue;
                }
            }

            int currentIndexASCIIValue = (int) currentIndexValue;

            if(currentIndexASCIIValue < 48 || currentIndexASCIIValue > 57){
                break;
            } else {
                result = (result * 10) + ((int) currentIndexValue - 48);
                isDigitExist = true;

                if(result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
                    result = Integer.MAX_VALUE;
                    result+=1;
                } ;
            }
        }

        int integerSign = 1;
        if(isSignExist && sign == '-') integerSign = -1;

        if(integerSign * result >= Integer.MAX_VALUE) return Integer.MAX_VALUE;

        if (integerSign * result <= Integer.MIN_VALUE) return Integer.MIN_VALUE;

        return (int) (integerSign * result);

    }
}
