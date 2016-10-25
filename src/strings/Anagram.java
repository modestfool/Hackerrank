package strings;

/**
 * @author: basavakanaparthi
 * on 01,Jun,2016 at 2:31 AM.
 */

import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        in.nextLine();
        for (int i = 0; i < T; i++)
        {
            int numDiffChars = 0;
            String text = in.nextLine();

            if(text.length()%2 != 0)
            {
                System.out.println(-1);
                continue;
            }
            String A = text.substring(0,text.length()/2);
            String B = text.substring(text.length()/2,text.length());
            System.out.println(A);
            System.out.println(B);
            for (char c: A.toCharArray())
            {
                if(!(B.contains(String.valueOf(c))))
                    ++numDiffChars;
            }
            System.out.println(numDiffChars);
        }
    }

    public static int numberNeeded(String first, String second)
    {
        int[] freqDiff = new int[26];
        for(char c: first.toCharArray())
            freqDiff[(int)c-'a'] += 1;
        for (char d: second.toCharArray())
        {
            freqDiff[(int)d-'a'] -= 1;
        }
        int ans = 0;
        for (int i: freqDiff)
            ans += Math.abs(i);
        return ans;
    }
}
