package algorithms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author: basavakanaparthi
 * on 13,Sep,2016 at 7:11 PM.
 */

/*  Consider an array of integers, .
The distance between two indices,  and , is denoted by .

Given , find the minimum  such that  and .

In other words, find the minimum distance between any pair of equal elements in the array. If no such value exists, print -1.

Note: |a|  denotes the absolute value of .

Input Format

    The first line contains an integer, , denoting the size of array .
    The second line contains  space-separated integers describing the respective elements in array .

Constraints

Output Format

    Print a single integer denoting the minimum  in ; if no such value exists, print .

Sample Input

6
7 1 3 4 1 7
Sample Output

3
Explanation
Here, we have two options:

 a_1 and a_4 are both 1, so d_1,4 = 3.
 a_0 and a_5 are both 7, so d_0,5 = 5.

 The answer is min(3,5) = 3.
 */
public class MinimumDistances
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int A[] = new int[n];
        int minDist = Integer.MAX_VALUE;

        for(int A_i=0; A_i < n; A_i++){
            A[A_i] = in.nextInt();
        }

        Map<Integer, Integer> indexMap = new HashMap<>(n);
        int tmp;
        for(int i = 0; i < n; i++)
        {
            if (indexMap.containsKey(A[i]))
            {
                tmp = i - indexMap.get(A[i]);
                if (tmp < minDist)
                    minDist = tmp;
                indexMap.put(A[i],i);
            }
            else
                indexMap.put(A[i],i);
        }
        if (minDist != Integer.MAX_VALUE)
            System.out.println(minDist);
        else
            System.out.println(-1);
    }
}
