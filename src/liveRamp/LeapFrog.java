/**
 * 
 */
package liveRamp;

/**
 * LeapFrog.java 
 * @author Basava R.Kanaparthi(basava.08@gmail.com)
 * Created on Mar 7, 2016
 */
public class LeapFrog {

	static int time(int[] A, int X, int D)
	{ if (X <= D)
		return 0;
	boolean[] leafPositions = new boolean[X + 1];
	int curr = 0;
	for (int i = 0; i < A.length; i++)
	{
	    leafPositions[A[i]] = true;
		if ((A[i]-curr) <= D)
		{
			X = X-(A[i] - curr);
			curr = A[i];
			for (int j = curr -1; j < curr + (X-D)-1; j++)
			{
				System.out.print( "j = " + j +" ");
				if (leafPositions[j] == true)
					curr = j;
			}
		}
		
		System.out.println(curr);
		if (X <= D)
			return i;
		
	}
//	for ( boolean b : leafPositions)
//			System.out.println(b);
	return -1;
	}
	
	public static void main(String[] args)
	{
		int[] A = {4, 4, 3, 2, 1, 2};
		System.out.println("time = " + time(A,5,2));
	}
}
