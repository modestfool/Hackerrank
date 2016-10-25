package warmup;
import java.util.HashSet;

/**
 * 
 */

/**
 * CoveringPrefix.java 
 * @author Basava R.Kanaparthi(basava.08@gmail.com)
 * Created on Mar 6, 2016
 */
public class CoveringPrefix {
	
	 public int index(int[] A) {
	        // write your code in Java SE 8
	        int result = 0;
	        HashSet<Integer> elements = new HashSet<>();
	        
	        for (int i = 0; i < A.length; i++)
	        {
	            if(!elements.contains(A[i]))
	            		{
	            			elements.add(A[i]);
	            			result = i;
	            		}
	        }
	        return result;
	    }

}
