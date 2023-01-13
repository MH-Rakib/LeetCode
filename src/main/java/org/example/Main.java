package org.example;

import org.example.helperClasses.LinkedList;
import org.example.helperClasses.ListNode;
import org.example.leetcodeSolutions.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Problem234 problem234 = new Problem234();

        LinkedList linkedList = new LinkedList();

        linkedList.insertNode(1);
        linkedList.insertNode(1);
        linkedList.insertNode(2);
        linkedList.insertNode(3);
        linkedList.insertNode(3);
        linkedList.insertNode(2);
        linkedList.insertNode(1);
        linkedList.insertNode(1);


        boolean result = problem234.isPalindrome(linkedList.head);
        System.out.println(result);
    }
}