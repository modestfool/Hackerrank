/**
 * 
 */
package warmup;

/**
 * Temperature.java 
 * @author Basava R.Kanaparthi(basava.08@gmail.com)
 * Created on Mar 16, 2016
 */
//Hanning Wang (110545235)
import java.util.Scanner;

public class Temperature {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the temperature(¡ãF)£º ");
		double T = sc.nextDouble();
		System.out.println(T+"¡ãF is equals to "+(T-32)*5.0/9.0+"¡ãC");
	}

}
