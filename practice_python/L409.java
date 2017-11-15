class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> h = new HashMap<Character,Integer>();
        if(s.length()==0||s.length()==1)
            return s.length();
        int count=0;
        for(Character c:s.toCharArray()){
            if(h.containsKey(c))
               h.put(c,h.get(c)+1);
            else
                h.put(c,1);     
        }
        for(Character c: h.keySet()){
            if( h.get(c)>1)
                if(h.get(c)%2==0)
                    count+=h.get(c);
                else
                    count += h.get(c)-1; 
        }
        
        return s.length()==count?count:count+1;
    }
}