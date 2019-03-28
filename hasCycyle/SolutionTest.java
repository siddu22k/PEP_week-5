package hasCycyle;

//Junit test for the linked list having Cycle

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

	@Test
	void testHasCycle() {
		Solution.SinglyLinkedList test = new Solution.SinglyLinkedList();
		
		int[] arr = new int[] {1,2};
		
		for ( int i = 0;i<arr.length;i++)
		{
			test.insertNodewithCycle(arr[i]);
		}
		
		boolean output = Solution.hasCycle(test.head);
		assertEquals(output,true);
		
		
		
		
		
		
	}

}
