class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> h = new HashSet<Integer>();
        
        for(int i=0;i<nums.length;i++){
            h.add(nums[i]);
        }
        if(h.size()<nums.length)
            return true;
        return false;
    }
}