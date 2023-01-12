package org.example.leetcodeSolutions;

import org.example.helperClasses.ListNode;

public class Problem203 {

    // Approach 01:
    // 1. Using 1 pointer
    // 2. Using a extra "dummy" node before head [If the head contains the targeted element], will return dummy.next[New head].

    public ListNode removeElementsApproach01(ListNode head, int val) {
        ListNode dummyNode = new ListNode();

        dummyNode.next = head;
        ListNode currentNode = dummyNode;

        while (currentNode.next != null){
            if(currentNode.next.item == val){
                currentNode.next = currentNode.next.next;
            } else {
                currentNode = currentNode.next;
            }
        }
        return dummyNode.next;
    }
}
