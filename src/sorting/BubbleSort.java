package sorting;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: basavakanaparthi
 * on 28,Sep,2016 at 9:39 PM.
 */
public class BubbleSort {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = in.nextInt();
        int numSwaps = bubbleSort(arr);
        System.out.println(String.format("Array is sorted in %d swaps.", numSwaps));
        System.out.println(String.format("First Element: %d", arr[0]));
        System.out.println(String.format("Last Element: %d", arr[arr.length-1]));
    }

    static int bubbleSort(int[] arr)
    {
        int totalSwaps = 0;
        for (int anArr : arr) {
            int numSwaps = 0;
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    numSwaps++;
                }
            }
            System.out.println(Arrays.toString(arr));
            if (numSwaps == 0)
                break;
            totalSwaps += numSwaps;
        }
        return totalSwaps;
    }
    static void swap(int[] arr, int i, int j)
    {
        arr[i] = arr[i]^arr[j];
        arr[j] = arr[i]^arr[j];
        arr[i] = arr[i]^arr[j];
    }
}
