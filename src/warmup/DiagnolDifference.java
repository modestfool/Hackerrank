package warmup;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DiagnolDifference {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        int primary_diagnol_sum = 0;
        int secondary_diagnol_sum = 0;
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
                if (a_i == a_j)
                	primary_diagnol_sum += a[a_i][a_j];
                if (a_i + a_j == n-1)
                	secondary_diagnol_sum += a[a_i][a_j];
            }
        }
        System.out.print(Math.abs(primary_diagnol_sum - secondary_diagnol_sum));
        in.close();
    }
}