class Solution {
    public int minMoves(int[] nums) {
        int total=0,min=nums[0];
        
        for(int i=0;i<nums.length;i++)
            min = Math.min(min,nums[i]);
        for(int i=0;i<nums.length;i++)
            total +=(nums[i]-min);
        
        return total;
    }
}


