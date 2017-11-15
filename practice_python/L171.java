class Solution {
    public int titleToNumber(String s) {
        char[] ch = s.toCharArray();
        int sum=0;
        
        for(int i=0;i<ch.length;i++){
            sum =sum*26+(ch[i]-65+1);
            
        }
        return sum;
    }
}