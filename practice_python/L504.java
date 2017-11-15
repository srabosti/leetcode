class Solution {
    public String convertToBase7(int num) {
        if(num<0)
            return "-"+convertToBase7(-1*num);
        else if(num<7)
            return ""+num;
        else
            return convertToBase7(num/7)+(num%7);
    }
}