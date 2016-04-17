package warmup;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Staircase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        for (int i = 0; i < n; i++)
        {
        	StringBuilder output = new StringBuilder();
        	for (int j = 0; j < n-i-1;j++)
        	{
        		output.append(" ");
        	}
        	for (int j = 0; j < i+1; j++)
        	{
        		output.append("#");
        	}
        	System.out.println(output.toString());
        }
   }
}