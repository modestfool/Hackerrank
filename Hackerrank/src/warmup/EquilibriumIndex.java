package warmup;
/**
 * 
 */

/**
 * Equilibrium.java 
 * @author Basava R.Kanaparthi(basava.08@gmail.com)
 * Created on Mar 6, 2016
 */
public class EquilibriumIndex {
	
	public int index(int[] A) {
        // write your code in Java SE 8
        long sum = 0;
        long leftsum = 0;
		for ( int i = 0; i < A.length; i++)
        {
        	sum += A[i];
        }
		
		for (int i = 0; i < A.length; i++)
		{
			sum -= A[i];
			if (sum == leftsum)
				return i;
			leftsum += A[i];
		}
		return -1;
    }
	
}
