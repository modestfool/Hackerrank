/**
 * 
 */
package arrays;

/**
 * MaxSubArray.java 
 * @author Basava R.Kanaparthi(basava.08@gmail.com)
 * Created on Mar 21, 2016
 */
import java.util.*;
public class MaxSubArray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int t = 0; t < T; t++)
        {
            int N = in.nextInt();
            int[] inputArray = new int[N];
            for (int i = 0; i < N; i++)
            {
                inputArray[i] = in.nextInt();
            }
//            System.out.print(GetMaxSumCont(inputArray) + " " + GetMaxSum(inputArray));
            System.out.println("Max:" + GetMaxSumCont(inputArray));
        }
    }
    
    public static int GetMaxSumCont(int[] array)
    {
        int maxSum = array[0];
        int localSum = array[0];
        for (int i = 1; i < array.length; i++)
        {
           localSum = Math.max(array[i], localSum + array[i]);
           maxSum = Math.max(maxSum,localSum);
        }
        return maxSum;
    }
    
    public static int GetMaxSum(int[] array)
    {
        int maxSum = Integer.MIN_VALUE;
        for (int a : array)
        {
           maxSum = Math.max(Math.max(maxSum, maxSum + a),a);
        }
        return maxSum;
    }
}
