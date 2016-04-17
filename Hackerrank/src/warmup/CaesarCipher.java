package warmup;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CaesarCipher {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int k = in.nextInt();
        char cipher[] = new char[n];
        for (int i = 0; i < n; i++)
        {
        	if(s.charAt(i)>= 65 && s.charAt(i) <= 90)
        	{
        		cipher[i] = (char) ((char)((s.charAt(i)- 65 + k)% 26) + 65);
        	}
        	else if (s.charAt(i)>= 97 && s.charAt(i) <= 122)
        	{
        		cipher[i] = (char) ((char)((s.charAt(i)-97 + k)% 26) + 97);
        	}
        	else
        		cipher[i] = s.charAt(i);
        }
        System.out.print(cipher);
    }
}
