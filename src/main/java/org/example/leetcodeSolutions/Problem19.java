package org.example.leetcodeSolutions;

import org.example.helperClasses.ListNode;

import java.util.ArrayList;
import java.util.List;

public class Problem19 {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode currentNode = head;
        // Head is given that's why min length of the list will be 1.
        int listLength = 1;

        // Calculating the size of the list
        while(currentNode.next != null) {
            listLength++;
            currentNode = currentNode.next;
        }

        // If n == length that means remove the first element
        if(n == listLength) {
            head = head.next;
            return head;
        }

        // removing the targeted element.
        int nodeToRemove = listLength - n;
        currentNode = head;
        for(int i=0; currentNode.next!=null && i<nodeToRemove-1; i++){
            currentNode = currentNode.next;
        }
        currentNode.next = currentNode.next.next;

        return head;
    }

    public List<Integer> getTestCase(){
        List<Integer> testCases = new ArrayList<>();
        testCases.add(1);
        testCases.add(2);
        testCases.add(3);
        testCases.add(4);
        testCases.add(5);
        testCases.add(6);
        testCases.add(7);
        return testCases;
    }
}

