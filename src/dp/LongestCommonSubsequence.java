/**
 * 
 */
package dp;

import java.util.Arrays;
import java.util.Scanner;

/**
 * LongestCommonSubsequence.java 
 * @author Basava R.Kanaparthi(basava.08@gmail.com)
 * Created on Apr 20, 2016
 */
public class LongestCommonSubsequence {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] A = new int[n];
        int[] B = new int[m];
        for (int i = 0; i < n; i++)
            A[i] = in.nextInt();
        for (int i = 0; i < m; i++)
            B[i] = in.nextInt();
        for ( int l : LCS(A,B))
            System.out.print(l + " ");
    }
    
    public static int[] LCS(int[] A, int[] B)
    {
        if (A.length == 0 || B.length == 0)
            return null;
        else if (A[A.length-1] == B[B.length-1])
        {
            int A_[] = Arrays.copyOfRange(A,0,A.length-1);
            int B_[] = Arrays.copyOfRange(B,0,B.length-1);
            return concat(LCS(A_,B_), Arrays.copyOfRange(A,A.length-1,A.length));
        }
        else
        {
            int[] A_ = Arrays.copyOfRange(A,0,A.length-1);
            int[] B_ = Arrays.copyOfRange(B,0,B.length-1);
            int[] lcs_A = LCS(A_,B);
            int[] lcs_B = LCS(A,B_);
            return (lcs_A.length > lcs_B.length) ? lcs_A:lcs_B;
        }
    }
    public static int[] concat(int[] A, int[] B)
    {
    	int[] emptySet = new int[0];
    	if (A == null && B == null)
    		return emptySet;
    	else if (A == null)
    		return B;
    	else if (B == null)
    		return A;
    	System.out.println(A.length + ": " + B.length);
        int[] result = new int[A.length + B.length];
        	result = Arrays.copyOf(A, A.length + B.length);
        System.arraycopy(B,0,result,A.length,B.length);
        return result;
    }

}
