package bitManipulation;

import java.util.Scanner;

/**
 * @author: basavakanaparthi
 * on 06,Oct,2016 at 8:38 PM.
 */
public class SumVsXor {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long ans = 1;
        for (long i = 1; i < n; i++)
        {
            long carry = n&i;
            if (carry == 0)
                ans++;
        }
        System.out.println(ans);
    }
}
