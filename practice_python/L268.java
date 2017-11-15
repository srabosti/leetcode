class Solution {
    public int missingNumber(int[] nums) {
        int xor=0;
        for(int i=0;i<nums.length;i++){
            xor ^= nums[i];
        }
        
        for(int i=1;i<=nums.length;i++){
            xor ^= i;
        }
        
        return xor;
    }
}