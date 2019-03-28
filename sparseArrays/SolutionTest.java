package sparseArrays;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

	@Test
	void testMatchingStrings() {
		Solution test = new Solution();
		String[] strings = new String[] {"aba","baba","aba","xzxb"};
		String[] queries = new String[] {"aba","xzxb","ab"};
		int [] solution = new int[] {2,1,0};
		int [] output = test.matchingStrings(strings, queries);
		
		assertArrayEquals(output,solution);
		
		
	}

}
