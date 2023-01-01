package org.example.leetcodeSolutions;

import org.example.helperClasses.ListNode;

import java.util.ArrayList;
import java.util.List;

public class Problem206 {
    public ListNode reverseList(ListNode head) {
        // Steps:
        // 1. Take the reference of the next node
        // 2. Head.next = previousNode [ in the 1st iteration previous is null ]
        // 3. Current node will be the new previous node
        // 4. Next node will be the new head
        // 5. Process continues until currentNode != null
        // 6. Return Previous Node as current node becomes null at the last iteration.


        ListNode currentNode = head;
        ListNode previousNode = null;

        while (currentNode != null){
            ListNode nextNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
        }

        return previousNode;
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
