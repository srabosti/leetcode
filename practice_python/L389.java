class Solution {
    public char findTheDifference(String s, String t) {
        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();
        char ch='\0';
        for(int i=0;i<ch1.length;i++)
            ch ^=ch1[i];
        for(int j=0;j<ch2.length;j++)
            ch^=ch2[j];
        
        return ch;
    }
}