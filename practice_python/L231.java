class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0)
            return false;
        int bitCount = Integer.bitCount(n);
        
        
        return (bitCount==1);
    }
}