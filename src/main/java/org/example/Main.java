package org.example;

import org.example.leetcodeSolutions.Problem6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Problem6 problem6 = new Problem6();
        List<String> testCases = problem6.getTestCase();

        for(int i=0; i<testCases.size(); i++){
            String result = problem6.convert(testCases.get(i), 1);
            System.out.println(result);
        }

    }
}