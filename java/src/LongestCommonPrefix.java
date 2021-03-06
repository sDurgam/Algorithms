import java.util.Arrays;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) return "";
        
        Arrays.sort(strs);
        String prefix = strs[0];
        int j = 0;
        for(int i =1; i < strs.length; i++){
            j = 0;
            for(;j < strs[i].length() && j < strs[i-1].length(); j++)
            {
                if(strs[i].charAt(j) != strs[i-1].charAt(j)){
                  break;
                }
            }
            if(prefix.length() > j){
                prefix = strs[i].substring(0,j);
            }
        }
        return prefix;
    }
}
