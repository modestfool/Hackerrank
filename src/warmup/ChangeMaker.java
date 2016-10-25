/**
 * 
 */
package warmup;

/**
 * ChangeMaker.java 
 * @author Basava R.Kanaparthi(basava.08@gmail.com)
 * Created on Mar 16, 2016
 */

import java.util.Scanner;
public class ChangeMaker {
	public static void main(String [] a)
	{
		int remainder, Q, D, N, P, change;
		System.out.println("Input change from 1-99: ");
		Scanner sc = new Scanner(System.in);
		change = sc.nextInt();
		Q = change / 25;
		remainder = change % 25;
		D = remainder / 10;
		remainder = remainder % 10;
		N = remainder / 5;
		remainder = remainder % 5;
		P = remainder / 1;
		System.out.println(Q+" Quarters, "+D+" Dimes, "+N+" Nickels, " +P+ " Pennies, ");
	}
}


