package org.example;

import org.example.helperClasses.LinkedList;
import org.example.helperClasses.ListNode;
import org.example.leetcodeSolutions.Problem19;
import org.example.leetcodeSolutions.Problem6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Problem19 problem19 = new Problem19();
        List<Integer> testCases = problem19.getTestCase();

        LinkedList linkedList = new LinkedList();
        for(int i=0; i<testCases.size(); i++){
            linkedList.insertNode(testCases.get(i));
        }

        linkedList.printList();

        problem19.removeNthFromEnd(linkedList.head, 1);

        linkedList.printList();

    }
}