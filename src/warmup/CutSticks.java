package warmup;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CutSticks {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        int min_stick = 1000;
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
            if (arr[arr_i] < min_stick)
            	min_stick = arr[arr_i];
        }
//        QuickSort(arr);
        int ans = n;
        while(ans > 0)
        {
        	System.out.println(ans);
        	int zero_sticks = 0;
        	int new_min = 1000;
        	for(int arr_i=0; arr_i < n; arr_i++)
        	{
        		if(arr[arr_i] > 0)
        		{
        			arr[arr_i] -= min_stick;
        			if(arr[arr_i] == 0)
        				zero_sticks += 1;
        			else if(arr[arr_i] < new_min)
        			{
        				new_min = arr[arr_i];
        				
        			}
        		}
//        		System.out.format ("%d ", arr[arr_i]);
        	}
//        	System.out.println();
        	min_stick = new_min;
//        	System.out.format("Min stick %d \n", min_stick);
        	ans -= zero_sticks;
       }
}

	private static void QuickSort(int[] arr) {
		// TODO Auto-generated method stub
		int pivot = arr[0];
		int n = arr.length;
	}
}
