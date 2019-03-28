package hasCycyle;
/*
 * A linked list is said to contain a cycle if any node is visited more than once while traversing the list.

Complete the function provided for you in your editor. It has one parameter: a pointer to a Node object named  that points to the head of a linked list. 
Your function must return a boolean denoting whether or not there is a cycle in the list. 
If there is a cycle, return true; otherwise, return false.
 */

public class Solution {

    static class SinglyLinkedListNode {
        public  int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
        
        
        public void insertNodewithCycle(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
            this.tail.next=this.head;
        }
        
        
    }
    
    static boolean hasCycle(SinglyLinkedListNode head) {
        if(head==null)
            return false;

        else
        {
            SinglyLinkedListNode one = head;
            SinglyLinkedListNode two = head;

            while(one.next!=null && one.next.next!=null)
            {
                one=one.next;
                two=one.next.next;
                
                if(one==two)
                    return true;
            }

        }

        return false;


    }
}
