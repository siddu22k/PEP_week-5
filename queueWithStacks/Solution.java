package queueWithStacks;
/*
 * A queue is an abstract data type that maintains the order in which elements were added to it, 
 * allowing the oldest elements to be removed from the front and new elements to be added to the rear.
 *  This is called a First-In-First-Out (FIFO) data structure because the first element 
 *  added to the queue (i.e., the one that has been waiting the longest) is always the first one to
   be removed.

A basic queue has the following operations:

Enqueue: add a new element to the end of the queue.
Dequeue: remove the element from the front of the queue and return it.
 */

import java.util.Scanner;
import java.util.Stack;

public class Solution {

    Stack<Integer> s1 = new Stack<Integer>();  
         Stack<Integer> s2 = new Stack<Integer>();

    public void enQueue(int n)
        {
            while (!s1.isEmpty())
                s2.push(s1.pop()); 

            s1.push(n);

            while (!s2.isEmpty())
                s1.push(s2.pop());
        }

    public  void deQueue()
        {
            if (!s1.isEmpty())  
                    s1.pop();
        }

        public void printFirst()
        {
            System.out.println(s1.peek());
        }


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        Solution queue = new Solution();

        int n= sc.nextInt();
        

          

        for (int i = 0;i<n;i++)
        {
            int temp = sc.nextInt();

            if(temp==1)
            {
                int val = sc.nextInt();
                queue.enQueue(val);
            }

            else if (temp == 2)
            {
                queue.deQueue();
            }
            else
                queue.printFirst();
        }
        
        sc.close();
    }
}

