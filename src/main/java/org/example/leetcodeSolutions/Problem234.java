package org.example.leetcodeSolutions;

import org.example.helperClasses.LinkedList;
import org.example.helperClasses.ListNode;

public class Problem234 {
    // Approach
    // 1. Slow & fast pointer to get the mid of the list
    // 2. Reverse list from mid.next to the last element
    // 3. Now fast == original head & slow == head of the reversed list(Actually the tail element)
    // 4. Traverse over the list from fast & slow till slow.next != null.
    // 5. If fast.element != slow.element, return false otherwise true.

    // 1 -> 2 -> 3 -> 3 -> 2 -> 1     [Case: Length is even]
    //           ^ (mid)
    // 1 -> 2 -> 3 -> null   null <- 3 <- 2 <- 1

    // 1 -> 2 -> 3 -> 2 -> 1          [Case: Length is odd]
    //           ^ (mid)
    // 1 -> 2 -> 3 -> null   null <- 2 <- 1

    public boolean isPalindrome(ListNode head) {

        ListNode currentNode = head;

        ListNode midNode = getMidNode(head);
        ListNode reversedHead = getReversedHead(midNode);

        while (currentNode != null){
            System.out.print(currentNode.item);
            currentNode = currentNode.next;
        }

        System.out.println(",");

        while (reversedHead != null){
            System.out.print(reversedHead.item);
            reversedHead = reversedHead.next;
        }


        while (reversedHead != null){
            if(reversedHead.item != head.item){
                return false;
            }

            reversedHead = reversedHead.next;
            head = head.next;
        }

        return true;
    }

    private ListNode getMidNode(ListNode head){
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }

    private ListNode getReversedHead(ListNode node){
        ListNode current = node;
        ListNode previous = null;

        while (current != null){
            ListNode temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
        }
        return previous;
    }

}
