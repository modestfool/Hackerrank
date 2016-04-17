package twitter;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {


	    static String[] Correlation(String[] scores) {
	    
	        double rMP = 0;
	        double rPC = 0;
	        double rCM = 0;
	        int MP = 0;
	        int PC = 0;
	        int CM = 0;
	        int M = 0, P = 0, C = 0;
	        int MSq = 0, PSq =0, CSq =0;
	        int n = scores.length;
	        for (String score : scores)
	        {
	            String[] s = score.split("\\s+");
	            int m = Integer.valueOf(s[0]);
	            int p = Integer.valueOf(s[1]);
	            int c = Integer.valueOf(s[2]);
	            MP += m*p;
	            PC += p*c;
	            CM += c*m;
	            M += m;
	            P += p;
	            C += c;
	            MSq += m*m;
	            PSq += p*p;
	            CSq += c*c;
	        }
	        rMP = Math.round(((n*MP - P*M)/(Math.sqrt(n*MSq - M*M)*Math.sqrt(n*PSq - P*P)))*100d)/100d;
	        rPC = Math.round(((n*PC - P*C)/(Math.sqrt(n*PSq - P*P)*Math.sqrt(n*CSq - C*C)))*100d)/100d;
	        rCM = Math.round(((n*CM - C*M)/(Math.sqrt(n*CSq - C*C)*Math.sqrt(n*MSq - M*M)))*100d)/100d;
	        String[] result = new String[3];
	        result[0] = String.valueOf(rMP);
	        result[1] = String.valueOf(rPC);
	        result[2] = String.valueOf(rCM);
	        
	        return result;
	    }

    public static void main (String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
//        final String fileName = System.getenv("OUTPUT_PATH");
//        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        String[] res;
        
        int _scores_size = 0;
        _scores_size = Integer.parseInt(in.nextLine());
        String[] _scores = new String[_scores_size];
        String _scores_item;
        for(int _scores_i = 0; _scores_i < _scores_size; _scores_i++) {
            try {
                _scores_item = in.nextLine();
            } catch (Exception e) {
                _scores_item = null;
            }
            _scores[_scores_i] = _scores_item;
        }
        
        res = Correlation(_scores);
//        for(int res_i=0; res_i < res.length; res_i++) {
//            bw.write(String.valueOf(res[res_i]));
//            bw.newLine();
//        }
//        
        for (String s : res)
        	System.out.println(s);
//        bw.close();
    }
}