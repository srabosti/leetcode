class Solution {
    public boolean detectCapitalUse(String word) {
        char[] ch = word.toCharArray();
        int capital = 0;
        
        for(int i=0;i<ch.length;i++){
            if(ch[i]>=65&&ch[i]<=90)
                capital++;      
        }
        if(capital==ch.length)
            return true;
        if(capital==1&&ch[0]>=65&&ch[0]<=90)
            return true;
        if(capital==0)
            return true;
        return false;
    }
}