package middleElementLL;



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
        
       
        }
     static int middleElement(SinglyLinkedListNode head)
     {
    	 SinglyLinkedListNode temp1 = head; 
    	 SinglyLinkedListNode temp2 = head; 
         if (head != null) 
         { 
             while (temp2 != null && temp2.next != null) 
             { 
            	 temp2 = temp2.next.next; 
                 temp1 = temp1.next; 
             } 
             
         } 
         return temp1.data;
     	
     	}

}
