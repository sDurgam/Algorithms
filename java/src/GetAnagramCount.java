import java.util.*;
import java.lang.*;
import java.io.*;

/*Given a word and a text, return the count of the occurences of anagrams of the word in the text(For eg: anagrams of word for are for, ofr, rof etc.))
*/
public class GetAnagramCount {
	public static void main (String[] args) {
		//code
		Scanner scanner = new Scanner(System.in);
		int T = Integer.parseInt(scanner.nextLine());
		String s1 = null;
		String text = null;
		for(int i =0; i < T; i++){
		    text = scanner.nextLine();
		    s1 = scanner.nextLine();
		    System.out.println(getAnagramCount(s1, text));
		}
		scanner.close();
	}
	
	   public static long getAnagramCount(String s1, String text){
        long count = 0;
        double hashcode1 = getHashcode(s1, s1.length());
        double hashcode2 = 0;
        int k = s1.length();
        int p =0;
        hashcode2 = getHashcode(text, k);
        if(hashcode1 == hashcode2)
        {
            count ++;
        }
        p ++;
        hashcode2 = hashcode2/(text.charAt(0));
        for( ;p < text.length()-k+1; p++)
        {
            hashcode2 = hashcode2 * (text.charAt(p + k - 1));
            if(hashcode1 == hashcode2){
                count ++;
            }
            hashcode2 = hashcode2/(text.charAt(p));
        }
        return count;
    }
    static int hash = 7;
    private static double getHashcode(String s, int k){
        long code = hash * 31;
        for(int i =0; i < k; i++){
           code *= (s.charAt(i));
        }
        return code;
    }

}
