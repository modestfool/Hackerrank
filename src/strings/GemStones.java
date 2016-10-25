package strings;

/**
 * @author: basavakanaparthi
 * on 01,Jun,2016 at 1:26 AM.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class GemStones {

    public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int N;
        int[] alphabets = new int[26];
        int gemElements = 0;
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        in.nextLine();

        for(int i = 0; i < N; i++)
        {
            String rock = in.nextLine();
            Set <Character> uniqueChars = new LinkedHashSet<Character>();
            for(char c: rock.toCharArray())
                uniqueChars.add(c);
            for(char c: uniqueChars)
            {
                alphabets[(int) c - (int)'a'] += 1;
            }
        }

        for (int g: alphabets)
        {
            if (g == N)
                gemElements++;
        }
        System.out.println(gemElements);
    }
}

