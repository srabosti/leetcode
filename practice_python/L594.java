class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
        
        for(int i=0;i<nums.length;i++){
            h.put(nums[i],h.getOrDefault(nums[i],0)+1);
        }
        
        int result= 0;
        
        for(int key:h.keySet()){
            if(h.containsKey(key+1)){
                result = Math.max(result, h.get(key+1)+h.get(key));
            }
        }
        
        return result;
    }
}