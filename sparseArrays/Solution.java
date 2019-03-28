package sparseArrays;
/*
 * There is a collection of input strings and a collection of query strings. 
 * For each query string, determine how many times it occurs in the list of input strings.
 */


	public class Solution {

	    // Complete the matchingStrings function below.
	    int[] matchingStrings(String[] strings, String[] queries) {
	        int[] total= new int[queries.length];
	        int count=0;

	        for(int i = 0;i<queries.length; i++)
	        {
	            String temp = queries[i];
	            count=0;
	            for ( int j=0;j<strings.length;j++)
	            {
	                if(temp.equals(strings[j]))
	                    count++;

	            }
	            total[i]=count;

	        }

	        return total;


	    }

}
