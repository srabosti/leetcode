class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] numChar = new int[26];
        
        for(int i=0;i<magazine.length();i++){
            numChar[magazine.charAt(i)-97]++;  
        }
        
        for(int i=0;i<ransomNote.length();i++){
            if(numChar[ransomNote.charAt(i)-97]==0)
                return false;
            else
                numChar[ransomNote.charAt(i)-97]--; 
        }
        
        return true;
    }
}