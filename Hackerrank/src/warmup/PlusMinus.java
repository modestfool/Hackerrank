package warmup;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PlusMinus {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        int num_positive = 0, num_negative = 0, num_zeros = 0;
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
            if (arr[arr_i] < 0)
            	num_negative++;
            else if (arr[arr_i] > 0)
            	num_positive++;
            else
            	num_zeros++;
        }
        //System.out.format("%d %d %d %d\n",num_positive, num_negative, num_zeros, n);
        double f_p = (double)num_positive/n;
        double f_n = (double)num_negative/n;
        double f_z = (double)num_zeros/n;
        System.out.format("%.4f \n%.4f \n%.4f\n",f_p,f_n,f_z);
    }
}
