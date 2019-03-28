package hasCycyle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTestNoCycle {

	@Test
	void testHasCycle() {
		Solution.SinglyLinkedList test = new Solution.SinglyLinkedList();
		
		int[] arr = new int[] {1,2,3,4,5,6};
		
		for ( int i = 0;i<arr.length;i++)
		{
			test.insertNode(arr[i]);
		}
		
		boolean output = Solution.hasCycle(test.head);
		assertEquals(output,false);
	}

}
