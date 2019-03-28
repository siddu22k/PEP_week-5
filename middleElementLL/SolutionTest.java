package middleElementLL;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

	@Test
	void test() {
		Solution.SinglyLinkedList test = new Solution.SinglyLinkedList();
       int[] arr = new int[] {1,2,3,4,5};
		
		for ( int i = 0;i<arr.length;i++)
		{
			test.insertNode(arr[i]);
		}
		int actual = 3;
		int output = Solution.middleElement(test.head);
		assertEquals(output,actual);
		
	}

}
