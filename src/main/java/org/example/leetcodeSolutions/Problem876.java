package org.example.leetcodeSolutions;

import org.example.helperClasses.ListNode;

public class Problem876 {
    public ListNode middleNode(ListNode head) {
        ListNode tempHead = head;
        int sizeOfTheList = 0;

        while (tempHead != null){
            sizeOfTheList++;
            tempHead = tempHead.next;
        }

        int middleIndexOfTheList = sizeOfTheList / 2;

        for(int i=0; i<middleIndexOfTheList; i++){
            head = head.next;
        }

        return head;
    }
}
