package org.example.leetcodeSolutions;

import org.example.helperClasses.ListNode;

import java.util.HashSet;

public class Problem141 {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> listNodeHashSet = new HashSet<>();

        ListNode currentNode = head;

        while(currentNode != null){
            if(listNodeHashSet.contains(currentNode)){
                return true;
            }
            listNodeHashSet.add(currentNode);
            currentNode = currentNode.next;
        }
        return false;
    }
}
