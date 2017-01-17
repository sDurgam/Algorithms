import java.util.HashSet;
import java.util.Set;

public class PalindromePermutation {
    public boolean canPermutePalindrome(String s) {
        if(s == null || s.length() == 0) return true;
        boolean iseven = true;
        char ch;
        Set<Character> ht = new HashSet<Character>();
        if(s.length()%2 == 1) {iseven = false;}
        for(int i =0; i < s.length(); i++)
        {
            ch = s.charAt(i); 
            if(ht.contains(ch)){
                ht.remove(ch);
            } 
            else{
                ht.add(ch);
            }
        }
        if(iseven && ht.size() == 0) return true;
        if(!iseven && ht.size() == 1) return true;
        return false;
    }
}
