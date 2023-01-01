package org.example;

import org.example.helperClasses.LinkedList;
import org.example.helperClasses.ListNode;
import org.example.leetcodeSolutions.Problem19;
import org.example.leetcodeSolutions.Problem206;
import org.example.leetcodeSolutions.Problem6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Problem206 problem206 = new Problem206();
        List<Integer> testCases = problem206.getTestCase();

        LinkedList linkedList = new LinkedList();
        for(int i=0; i<testCases.size(); i++){
            linkedList.insertNode(testCases.get(i));
        }

//        linkedList.printList();

        ListNode head = problem206.reverseList(linkedList.head);

        linkedList.head = head;

        linkedList.printList();

    }
}