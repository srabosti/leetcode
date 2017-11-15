class Solution {
    public int findShortestSubArray(int[] nums) {
        int degree=0, minSize=nums.length;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        HashMap<Integer,Integer[]> map2 = new HashMap<Integer,Integer[]>();
        
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            degree = Math.max(degree,map.get(nums[i]));
            
            if(map2.get(nums[i])==null) map2.put(nums[i],new Integer[2]);
            Integer[] range = map2.get(nums[i]);
            if(range[0]==null) range[0]= i;
            range[1] = i;
        }
                               
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()!=degree) continue;
            Integer[] range = map2.get(entry.getKey());
            minSize = Math.min(minSize,range[1]-range[0]+1);
        }
                               
        return minSize;
    }
}