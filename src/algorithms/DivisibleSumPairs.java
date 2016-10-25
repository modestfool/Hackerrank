package algorithms;

import java.util.Scanner;

/**
 * @author: basavakanaparthi
 * on 13,Sep,2016 at 6:15 PM.
 */

/*
 * You are given an array of n integers A, and a positive integer, k .
 * Find and print the number of (i,j) pairs where  i < j and  a_i + a_j  is evenly divisible by k .
 *      Input Format
 *          The first line contains  space-separated integers,  and , respectively.
 *          The second line contains  space-separated integers describing the respective values of .
 *      Constraints
 *          2 < n <= 100
 *          1 <= k <= 100
 *          1 <= a_i <= 100
 *
 *          Output Format
 *              Print the number of  pairs where  and  +  is evenly divisible by .
 *          Sample Input
 *              6 3
 *              1 3 2 6 1 2
 *          Sample Output
 *              5
 */
public class DivisibleSumPairs {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        int kMod[] = new int[k];
        int numPairs = 0;

        for(int a_i=0; a_i < n; a_i++)
        {
            a[a_i] = in.nextInt();
            kMod[a[a_i]%k]++;
        }
//        printArray(kMod);

        for (int i = 0; i < n; i++)
        {
            kMod[a[i]%k]--;
            numPairs += kMod[(k - a[i]%k)%k];
//            System.out.println(i + ": ");
//            printArray(kMod);
//            System.out.println(numPairs);
        }

        System.out.println(numPairs);
    }

    private static void printArray(int[] arr)
    {
        for (int i : arr)
            System.out.print(i + " ");
        System.out.println();
    }
}
