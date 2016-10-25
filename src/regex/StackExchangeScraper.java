/**
 * 
 */
package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * StackExchangeScraper.java 
 * @author Basava R.Kanaparthi(basava.08@gmail.com)
 * Created on Apr 5, 2016
 */
public class StackExchangeScraper {

	 public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner in = new Scanner(System.in);
	        String input = "";
	        while (in.hasNextLine())
	        {
	        	String s = in.nextLine();
	        	if (s.equals("quit"))
	        		break;
	        	input += s;
//	        	System.out.println(input);
	        }
	        System.out.println(input);
	        
	        Pattern p1 = Pattern.compile("question-summary-([\\d]+)\"");
//	        Pattern p2 = Pattern.compile("<h3>\\[([\\s\\S]+)\\]<\\h3>");
	        Pattern p2 = Pattern.compile("<h3>\\[([\\s\\S]+?)\\]");
	        Pattern p3 = Pattern.compile("asked ([\\s\\S]+?)>([\\s\\S]+?)<\\/span");
	        
	        Matcher m1 = p1.matcher(input);
	        Matcher m2 = p2.matcher(input);
	        Matcher m3 = p3.matcher(input);
	        
	        while(m1.find())
	        {
	        	System.out.print(m1.group(1) + ";");
	        	if(m2.find())
	        	{
	        		System.out.print(m2.group(1) + ";");
	        	}
	        	if (m3.find())
	        	{
	        		System.out.println(m3.group(2));
	        	}
	        }
	        
	    }
}
