package strings;

/**
 * @author: basavakanaparthi
 * on 01,Jun,2016 at 1:53 AM.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FunnyString {

    public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        in.nextLine(); // To move the filedescriptor to the next line

        for (int i = 0; i < T; i++)
        {
            String S = in.nextLine();
            int N = S.length();
            char[] SArray = S.toCharArray();
            boolean funnyFlag = false;
            for( int j = 1; j <= SArray.length/2; j++)
            {
                if(Math.abs((int) SArray[j] - (int)SArray[j-1]) != Math.abs((int) SArray[N-j] - (int)SArray[N-(j+1)]))
                {
                    System.out.println("Not Funny");
                    funnyFlag = true;
                    break;
                }
            }
            if(funnyFlag != true)
                System.out.println("Funny");
        }
    }
}
