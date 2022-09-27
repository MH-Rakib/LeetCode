package org.example;

import org.example.leetcodeSolutions.Problem8;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Problem8 problem8 = new Problem8();
        List<String> testCases = problem8.getTestCases();

        for(int i=0; i<testCases.size(); i++){
            int result = problem8.myAtoi(testCases.get(i));
            System.out.println(result);
        }

    }
}