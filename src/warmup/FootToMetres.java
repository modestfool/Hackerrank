/**
 * 
 */
package warmup;

/**
 * FootToMetres.java 
 * @author Basava R.Kanaparthi(basava.08@gmail.com)
 * Created on Mar 16, 2016
 */
import java.util.Scanner;

public class FootToMetres {
	
	public static void main(String[] args)
	{
		double f, m;
		System.out.print("Enter a value in feet: ");
		Scanner input = new Scanner(System.in);
		f = input.nextDouble();
		m = f/3.2808;
		System.out.println(f + " feet is " + m +" meters");	
	}
}
