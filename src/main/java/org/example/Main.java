package org.example;

import org.example.helperClasses.LinkedList;
import org.example.helperClasses.ListNode;
import org.example.leetcodeSolutions.Problem19;
import org.example.leetcodeSolutions.Problem206;
import org.example.leetcodeSolutions.Problem217;
import org.example.leetcodeSolutions.Problem6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Problem217 problem217 = new Problem217();
        List<int[]> testCases = problem217.getTestCase();

        for(int i=0; i<testCases.size(); i++){
            boolean result = problem217.containsDuplicate(testCases.get(i));
            System.out.println(result);
        }
    }
}