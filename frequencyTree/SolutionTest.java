package frequencyTree;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

	@Test
	void testDecode() {
		Solution tree = new Solution();
		tree.root = new Node('\0',5); 
        tree.root.left = new Node('\0',2); 
        tree.root.right = new Node('A',3); 
        tree.root.left.left = new Node('B',1); 
        tree.root.left.right = new Node('C',1);
        
        String test= "1001011";
        String expected ="ABACA";
        String output = tree.decode(test, tree.root);
        assertEquals(output,expected);
        
	}

}
