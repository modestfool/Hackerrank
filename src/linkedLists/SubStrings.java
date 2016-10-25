/**
 * 
 */
package linkedLists;

/**
 * SubStrings.java 
 * @author Basava R.Kanaparthi(basava.08@gmail.com)
 * Created on Mar 9, 2016
 */
public class SubStrings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String str = "wowpurerocks";
		int c = count(str);
		System.out.println(c);
	}

	/**
	 * @param str
	 */
	private static int count(String str) {

		int count = 0;
		int len = str.length();
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<=len;j++)
			{
				String sub = str.substring(i,j);
				if(checkPalindrome(sub))
				{
					count++;
				}
			}
		}
		return count;
	}
	
	private static boolean checkPalindrome(String s)
	{
		int len = s.length();
		for(int i=0;i<len;i++)
		{
			if(s.charAt(i)!=s.charAt(len-1-i))
			{
				return false;
			}
		}
		return true;
	}

}
