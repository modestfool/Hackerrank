package strings;

/**
 * @author: basavakanaparthi
 * on 01,Oct,2016 at 10:03 PM.
 */
public class LongestSubString {

    static int longestCommonSub(String s1, String s2)
    {
        int m = s1.length() + 1;
        int n = s2.length() + 1;
        int res = 0;
        int[][] lCS = new int[m][n];
        for (int row = 0; row < m; row++)
        {
            for (int col = 0; col < n; col++)
            {
                if (row == 0 || col == 0) {
                    lCS[row][col] = 0;
                }
                else if (s1.charAt(row - 1 ) == s2.charAt(col - 1))
                {
                    lCS[row][col] = 1 + lCS[row - 1][col - 1];
                    res = Math.max(res, lCS[row][col]);
                }
                else
                    lCS[row][col] = 0;
            }
        }
        return res;

    }

    private static int longestCommonSub(String s1, String s2, int index1, int
            index2) {
        if (index1 > s1.length()-1 || index2 > s2.length() -1)
            return 0;
        if (s1.charAt(index1) == s2.charAt(index2))
            return 1 + longestCommonSub(s1,s2,index1+1,index2+1);
        else
            return 0;
    }

    public static void main(String[] args)
    {
        System.out.println(longestCommonSub("bcdef", "abcd"));
    }
}
