package warmup;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ChoclateFeast {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int c = in.nextInt();
            int m = in.nextInt();
            int num_choclates = n/c;
            int wrappers_left = num_choclates;
            while(wrappers_left >= m)
            {
            	int temp_wrappers = wrappers_left/m;
            	int rem_wrappers = wrappers_left%m;
            	num_choclates += temp_wrappers;
            	wrappers_left = temp_wrappers + rem_wrappers;
            }
            System.out.println(num_choclates);
        }
    }
}
