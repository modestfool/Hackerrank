/**
 * 
 */
package regex;

/**
 * FindHackerrank.java 
 * @author Basava R.Kanaparthi(basava.08@gmail.com)
 * Created on Apr 7, 2016
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FindHackerrank {
	    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner in = new Scanner(System.in);
	        int T = in.nextInt();
	        in.nextLine();
	        for(int i = 0; i < T; i++)
	        {
	            String line = in.nextLine();
	            String[] words = line.split(" ");
	            System.out.println("length " + words.length);
	            System.out.println(words[0] + " " + words[words.length - 1]);
	            String hack = "hackerrank";
	            Pattern r = Pattern.compile(hack);
	            Matcher m1 = r.matcher(words[0]);
	            Matcher m2 = r.matcher(words[words.length-1]);
	            boolean first = m1.find();
	            boolean second = m2.find();
	            
	            if(first && second)
	                System.out.println(0);
	            else if (first)
	                System.out.println(1);
	            else if (second)
	                System.out.println(2);
	            else 
	                System.out.println(-1);
	        }
	    }
}
