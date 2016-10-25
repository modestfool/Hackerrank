package balancedTrees;

/**
 * @author: basavakanaparthi
 * on 09,Jun,2016 at 11:06 PM.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ArrayBalancing {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int N, M;
        N = in.nextInt();
        M = in.nextInt();
        int[] originalArray = new int[N];
        int[] updatedArray = new int[N];
        for (int i = 0; i < N; i++)
            originalArray[i] = in.nextInt();
        for (int q = 0; q < M; q++)
        {
            int qType, startInd, endInd;
            qType = in.nextInt();
            startInd = in.nextInt() - 1;
            endInd = in.nextInt() - 1;
            if (qType == 1)
            {
                System.arraycopy(originalArray,startInd,updatedArray,0,endInd-startInd + 1);
                System.arraycopy(originalArray,0,updatedArray,endInd-startInd + 1,startInd);
//                for( int k : updatedArray)
//                    System.out.print(k);
//                System.out.println(String.format("%d, %d, %d",endInd+1,(originalArray.length - endInd - 1),originalArray.length - (endInd + 1 )));
//                System.out.println();
                System.arraycopy(originalArray,endInd+1,updatedArray,(endInd + 1),originalArray.length -(endInd + 1));
                originalArray = updatedArray;
                updatedArray = new int[N];
            }
            else if (qType == 2)
            {
                System.arraycopy(originalArray,0, updatedArray,0, startInd);
                System.arraycopy(originalArray,endInd + 1,updatedArray,startInd,originalArray.length - (endInd + 1));
                System.arraycopy(originalArray,startInd,updatedArray,originalArray.length - (endInd - startInd) - 1,endInd-startInd + 1);
//                for( int k : updatedArray)
//                    System.out.print(k);
//                System.out.println();
                originalArray = updatedArray;
                updatedArray = new int[N];
            }
        }
        System.out.println(Math.abs(originalArray[0] - originalArray[originalArray.length-1]));
        for(int a:originalArray)
            System.out.print(a);
    }
}