import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.HashMap;

public class MakingAnagrams {
    public static int numberNeeded(String first, String second) {
        if(first == null || second == null) return 0;
        //if(first == null) return second.length();
        //if(second == null) return first.length();
      Map<Character, Integer> charFreqMap = new HashMap<Character, Integer>();
        int freq = 1;
        char ch;
        String temp1;
        String temp2;
        if(first.length() >= second.length())
           {
            temp1 = first;
            temp2 = second;
        }
        else {
            temp1 = second;
            temp2 = first;
        }
        
        for(int i =0; i < temp1.length(); i++){
            freq = 1;
            ch = temp1.charAt(i);
            if(charFreqMap.containsKey(ch))
                {
                freq += charFreqMap.get(ch);
            }
            charFreqMap.put(ch, freq);
        }
        int commoncount = 0;
        for(int i =0; i < temp2.length(); i++){
            ch = temp2.charAt(i);
            if(charFreqMap.containsKey(ch) && charFreqMap.get(ch) >= 1){
                commoncount ++;
                freq = charFreqMap.get(ch);                
                charFreqMap.put(ch, --freq);
            }
        }
       // System.out.println(first.length());
       // System.out.println(second.length());
       // System.out.println(commoncount);
       return (first.length() + second.length()) - (2 * commoncount); 
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
        
    }
}
