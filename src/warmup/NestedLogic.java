package warmup;

import java.util.Scanner;

/**
 * @author: basavakanaparthi
 * on 23,Aug,2016 at 11:20 PM.
 */
public class NestedLogic {

        public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner in = new Scanner(System.in);
            int D_a, M_a, Y_a, D_e, M_e, Y_e;
            D_a = in.nextInt();
            M_a = in.nextInt();
            Y_a = in.nextInt();
            D_e = in.nextInt();
            M_e = in.nextInt();
            Y_e = in.nextInt();
            int fine = 0;
            fine = (D_a > D_e) ? 15 * (D_a - D_e) : fine;
            fine = (M_a > M_e) ? 500 * (M_a - M_e) : fine;
            fine = (Y_a > Y_e) ? 10000 : fine;
            System.out.println(fine);
        }
}
