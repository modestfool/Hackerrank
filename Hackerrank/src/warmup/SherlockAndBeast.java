package warmup;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SherlockAndBeast {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            check(n);
        }
    }

	private static void check(int n) {
		// TODO Auto-generated method stub
		StringBuilder decentNumber = new StringBuilder();
		for(int i = 0; i < n/3;i++)
        {
//			System.out.println((n-(i*3)));
        	if((n-(i*5))%3 == 0)
        	{ 
        		for (int l = 0; l < (n-(i*5)); l++)
        			decentNumber.append("5");
        		for (int k = 0; k < i*5; k++)
    				decentNumber.append("3");
        		
        		System.out.println(decentNumber.toString());
        		return;
        	}
        }
        for (int j = 0; j < n/5; j++)
        {
//        	System.out.println((n-(j*3)));
        	if((n-(j*3))%5 == 0)
        	{        	
        		for (int k = 0; k < j*3; k++)
    				decentNumber.append("5");
        		for (int l = 0; l < (n-(j*3)); l++)
        			decentNumber.append("3");
        		System.out.println(decentNumber.toString());
        		return;
        	}
        }
        System.out.println(-1);
	}
}
