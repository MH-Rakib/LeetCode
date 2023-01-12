package org.example.leetcodeSolutions;

import org.example.helperClasses.ListNode;

public class Problem83 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode currentNode = head;

        while (currentNode != null){

            // Case: [1,1,1,1,1,1]
            // Additional for loop is to eliminate repetitive occurrence
            while (currentNode.next != null && currentNode.item == currentNode.next.item){
                currentNode.next = currentNode.next.next;
            }
            currentNode = currentNode.next;
        }

        return head;
    }
}
