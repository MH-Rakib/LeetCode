package org.example.helperClasses;

public class LinkedList {

    public ListNode head = null;
    public ListNode tail = null;
    public Long size = 0l;


    public void insertNode(Integer item){
        if(this.head==null){
            ListNode node = new ListNode();
            node.item = item;
            node.next = null;
            this.head = node;
            this.tail = node;
            this.size++;
        } else {
            ListNode node = new ListNode();
            node.item = item;
            node.next = null;
            this.tail.next = node;
            this.tail = node;
            this.size++;
        }
    }

    public void printList(){
        ListNode currentNode = this.head;

        while (currentNode != null){
            System.out.println(currentNode.item);
            currentNode = currentNode.next;
        }
    }

}
