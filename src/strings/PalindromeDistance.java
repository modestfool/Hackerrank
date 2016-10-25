package strings;

/**
 * Created by basavakanaparthi on 5/31/16.
 */

import java.util.Scanner;

public class PalindromeDistance {

    public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int T;
        T = in.nextInt();
        in.nextLine();
        for (int i = 0; i < T; i++) {
            String text = in.nextLine();
//            System.out.println(text);
            char[] textArray = text.toCharArray();
            int maxIndex = text.length() - 1;
            int distance = 0;
            for (int j = 0; j < text.length() / 2; j++) {
                distance += Math.abs((int) textArray[j] - (int) textArray[maxIndex - j]);
            }
            System.out.println(distance);
        }
    }
}

