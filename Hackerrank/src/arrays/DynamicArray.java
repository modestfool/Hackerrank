/**
 * 
 */
package arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * DynamicArray.java 
 * @author Basava R.Kanaparthi(basava.08@gmail.com)
 * Created on Mar 14, 2016
 */
public class DynamicArray {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int lastAns = 0;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int q = in.nextInt();
        int size[] = new int[n];
        
        List<List<Integer>> sequences = new ArrayList<List<Integer>>(n);
        int i = n;
        while(i > 0)
        {
        	List<Integer> seq = new ArrayList<>();
        	sequences.add(seq);
        	i--;
        }
        for (i = 0; i < q; i++)
        {
            int op = in.nextInt();
            int x = in.nextInt();
            int y = in.nextInt();
            int ind = (x^lastAns)%n;

            if(op == 1)
            {
                List<Integer> seq = sequences.get(ind);
                seq.add(y);
                size[ind]++;
            }
            else if (op == 2)
            {
                List<Integer> seq = sequences.get(ind);
                lastAns  = seq.get(y%size[ind]);
                System.out.println(lastAns);
            }
        }
    }
}
