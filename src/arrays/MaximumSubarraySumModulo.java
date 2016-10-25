package arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: basavakanaparthi
 * on 03,Oct,2016 at 7:56 PM.
 */
/*
We define the following:

A subarray of an -element array, , is a contiguous subset of 's elements in the inclusive range from some index  to some index  where .
The sum of an array is the sum of its elements.
Given an -element array of integers, , and an integer, , determine the maximum value of the sum of any of its subarrays modulo . This means that you must find the sum of each subarray modulo , then print the maximum result of this modulo operation for any of the  possible subarrays.

Input Format

The first line contains an integer, , denoting the number of queries to perform. Each query is described over two lines:

The first line contains two space-separated integers describing the respective  (the array length) and  (the right operand for the modulo operations) values for the query.
The second line contains  space-separated integers describing the respective elements of array  for that query.
Constraints

 the sum of  over all test cases
Output Format

For each query, print the maximum value of  on a new line.

Sample Input

1
5 7
3 3 9 9 5
Sample Output

6
    https://www.hackerrank.com/challenges/maximum-subarray-sum
 */
public class MaximumSubarraySumModulo
{
    public static int getMaxModulo(int[] arr, int m)
    {
        int[] prefMod = new int[arr.length];
        int currSum = 0, maxSum = 0;
        int i;
        int j = arr.length -1;
        for (i = 0; i < prefMod.length; i++)
        {
            prefMod[i] = (currSum + arr[i])%m;
            currSum += prefMod[i];
        }
        System.out.println(Arrays.toString(prefMod));
        i = 0;
//        while (i < j)
//        {
//            if (prefMod[i] < prefMod[j])
//                i++;
//            else
//                j--;
//            currSum = (prefMod[i] - prefMod[j] + m)%m;
//            System.out.println("i: " + prefMod[i] + " " + "j: " + prefMod[j]);
//            if (currSum > maxSum)
//                maxSum = currSum;
//        }
        int startInd = -1;
        int endInd = -1;
        for (i = 0; i < prefMod.length; i++)
        {
            for (j = i+1; j <prefMod.length; j++)
            {
                currSum = (prefMod[i] - prefMod[j] + m)%m;
                if (currSum > maxSum) {
                    startInd = i;
                    endInd = j-1;
                    maxSum = currSum;
                }
            }
        }
        System.out.println(startInd + "," + endInd);
        return maxSum;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int t = 0; t < T; t++)
        {
            int N = in.nextInt();
            int m = in.nextInt();
            int[] inputArray = new int[N];
            for (int i = 0; i < N; i++)
            {
                inputArray[i] = in.nextInt();
            }
//            System.out.print(GetMaxSumCont(inputArray) + " " + GetMaxSum(inputArray));
            System.out.println("Max:" + getMaxModulo(inputArray,m));
        }
    }
}
