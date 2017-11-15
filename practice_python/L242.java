class Solution {
    public boolean isAnagram(String s, String t) {
        int[] arr = new int[26];
        
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-97]++;
        }
        for(int i=0;i<t.length();i++){
            arr[t.charAt(i)-97]--;
        }
        for(int i=0;i<26;i++){
            if(arr[i]!=0)
                return false;
        }
        return true;
    }
}