/**
 * 
 */
package regex;

/**
 * PhoneNumber.java 
 * @author Basava R.Kanaparthi(basava.08@gmail.com)
 * Created on Apr 13, 2016
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PhoneNumber {
	public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner in = new Scanner(System.in);
	        int N = in.nextInt();
	        in.nextLine();
	        Pattern p = Pattern.compile("([0-9]+)[\\s,-]([0-9]+)[\\s,-]([0-9]+)");
	        for (int i = 0; i < N; i++)
	        {
	           String num = in.nextLine();
	           Matcher m = p.matcher(num);
	           if(m.find())
	           {
	                       System.out.println(String.format("CountryCode=%s,LocalAreaCode=%s,Number=%s",
	                    		   m.group(1),m.group(2),m.group(3)));
	           }
	           
	        }

	}
}
