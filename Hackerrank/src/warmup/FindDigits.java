package warmup;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FindDigits {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int digit = 0;
            int divisor = 10;
            int num_digits = 0;
            int dummy = n;
            if(n <= 10)
            {
            	System.out.println(1);
            	continue;
            }
            while (dummy!= 0)
            {
            	digit = dummy%divisor;
            	dummy = dummy/divisor;
//            	System.out.println(dummy);
            	if(digit!=0)
            	{
            		if(n% digit == 0)
            		num_digits += 1;
            	}
//            		divisor *= 10;
            }
            System.out.println(num_digits);
        }
    }
}
