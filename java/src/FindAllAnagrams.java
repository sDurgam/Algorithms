import java.util.ArrayList;
import java.util.List;

/**
 * Created by root on 1/21/17.
 */
public class FindAllAnagrams {
    public static void main(String[] args){
        findAnagrams("baa", "aa");
    }
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<Integer>();
        if(s == null || p == null || p.length() > s.length()) return result;
        int[] chars = new int[26];
        char ch = 'a';
        int slength = s.length();
        int plength = p.length();
        int count = 0;
        for(int i =0; i < plength; i++){
            chars[p.charAt(i)-'a']++;
            count ++;
        }
        for(int i =0; i < plength; i++){
            chars[s.charAt(i)-'a']--;
            if(chars[s.charAt(i)-'a'] >= 0){
                count --;
            }
        }
        if(count == 0){
            result.add(0);
        }
        for(int i = plength; i < s.length(); i++){
            chars[s.charAt(i-plength)-'a']++;
            if(chars[s.charAt(i-plength)-'a'] > 0) {
                count++;
            }
            chars[s.charAt(i)-'a']--;
            if(chars[s.charAt(i)-'a'] >= 0){
                count --;
            }
            if(count == 0){
                result.add(i-plength+1);
            }
        }
        return result;
    }
}
