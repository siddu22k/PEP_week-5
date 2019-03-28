package frequencyTree;

/*
 * Huffman coding assigns variable length codewords to fixed length input characters based on their 
 * frequencies. More frequent characters are assigned shorter codewords and less frequent characters 
 * are assigned longer codewords. All edges along the path to a character contain a code digit. 
 * If they are on the left side of the tree, they will be a 0 (zero). If on the right, they'll be a 1 (one). 
 * Only the leaves will contain a letter and its frequency count. All other nodes will contain 
 * a null instead of a character, and the count of the frequency of all of it and its descendant characters.
 * 
 */

class Node 
{ 
    char data; 
    int frequency;
    Node left, right; 
  
    public Node(char item,int fre) 
    { 
        data = item; 
        frequency = fre;
        left = right = null; 
    } 
} 

public class Solution {
	
	Node root;
	
	Solution()
	{
		root =  null;
	}
	
 public String decode(String s, Node root) {
        Node temp = root;
        String s1="";

        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='1')
            {
                temp=temp.right;
            }
            else{
                temp=temp.left;
            }

            if(temp.left == null && temp.right == null)
            {
                s1=s1+temp.data;
                temp=root;   
            }
        }

        return s1;
    }

}
