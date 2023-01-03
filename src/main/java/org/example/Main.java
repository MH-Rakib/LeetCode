package org.example;

import org.example.helperClasses.LinkedList;
import org.example.helperClasses.ListNode;
import org.example.leetcodeSolutions.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Problem448 problem448 = new Problem448();
        List<int[]> testCases = problem448.getTestCase();

        for(int i=0; i<testCases.size(); i++){
            List<Integer> result = problem448.findDisappearedNumbers(testCases.get(i));
            System.out.println(result);
        }
    }
}