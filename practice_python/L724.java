class Solution {
    public int pivotIndex(int[] nums) {
        int total = 0;
        
        for(int i=0;i<nums.length;i++){
           total +=nums[i]; 
        }
        
        int currentVal=0;
        
        for(int i=0;i<nums.length;i++){
            if((total-nums[i])==currentVal*2){
                return i;
            }
            currentVal +=nums[i];
        }
        return -1;
    }
}