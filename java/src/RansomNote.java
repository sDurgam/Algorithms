public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] charFreqArray = new int[26];
        char ch;
        int index;
        if(ransomNote == null || magazine == null || ransomNote.length() > magazine.length()) return false;
        for(int i =0; i < magazine.length(); i++){
            ch = magazine.charAt(i);
            index = ch -'a';
            charFreqArray[index] ++;
        }
        for(int i =0; i < ransomNote.length(); i++)
        {
            ch = ransomNote.charAt(i);
            index = ch - 'a';
            if(charFreqArray[index] >= 1)
            {
                charFreqArray[index]--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
