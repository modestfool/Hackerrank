package warmup;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SherlockSquares {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner in = new Scanner(System.in);
    	int t = in.nextInt();
    	for (int a0 = 0; a0 < t; a0++)
    	{
    		int lower_num = in.nextInt();
    		int upper_num = in.nextInt();
    		int num_squares = 0;
//    		for (int i = lower_num; i <= upper_num; i++)
//    		{
    			if(isPerfectSquare(lower_num) || isPerfectSquare(upper_num))
    			{
    				num_squares += 1;
    				num_squares += Math.floor((Math.sqrt(upper_num))-(Math.sqrt(lower_num)));
    			}
//    			if(isPerfectSquare(upper_num))
//    			    num_squares +=1;
    			else
    				num_squares += Math.floor(Math.ceil(Math.sqrt(upper_num))-(Math.sqrt(lower_num)));
//    		}
    		System.out.println(num_squares);
    	}
    }

	private static boolean isPerfectSquare(int i) {
		int sqrt = (int)Math.sqrt(i);
		if((sqrt*sqrt) == i)
		{
//			System.out.println(sqrt*sqrt);
			return true;
		}
		return false;
	}
}