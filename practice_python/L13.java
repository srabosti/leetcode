class Solution {
    public int romanToInt(String s) {
        int total=0;
        String letter = s.toUpperCase();
        
        if(s.indexOf("IV")!=-1){total-=2;}
    if(s.indexOf("IX")!=-1){total-=2;}
    if(s.indexOf("XL")!=-1){total-=20;}
    if(s.indexOf("XC")!=-1){total-=20;}
    if(s.indexOf("CD")!=-1){total-=200;}
    if(s.indexOf("CM")!=-1){total-=200;}
        
        for(int i=letter.length()-1;i>=0;i--){
            if(letter.charAt(i)=='I')total +=1;
            else if(letter.charAt(i)=='V')total +=5;
            else if(letter.charAt(i)=='X')total +=10;
            else if(letter.charAt(i)=='L')total +=50;
            else if(letter.charAt(i)=='C')total +=100;
            else if(letter.charAt(i)=='D')total +=500;
            else if(letter.charAt(i)=='M')total +=1000;
        }
        
        return total;
    }
}