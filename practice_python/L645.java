class Solution {
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer> h =new HashSet<Integer>();
        int[] num = new int[2];
        for(int i=0;i<nums.length;i++){
            if(h.contains(nums[i]))
               num[0]=nums[i];
            else
                h.add(nums[i]);
        }
        for(int i=1;i<=nums.length;i++){
            if(!h.contains(i))
               num[1]=i;
        }
        return num;     
    }
}