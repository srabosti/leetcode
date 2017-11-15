class Solution {
    public String[] findRelativeRanks(int[] nums) {
        Integer[] index = new Integer[nums.length];
        
        for(int i=0;i<nums.length;i++){
            index[i] = i;
        }
        Arrays.sort(index,(a,b)->nums[a]-nums[b]);
        
        String[] s = new String[nums.length];
        
        for(int i=nums.length-1,j=0;i>=0;i--,j++){
            if(i==nums.length-1)
                s[index[i]]="Gold Medal";
            else if(i==nums.length-2)
                s[index[i]]="Silver Medal";
            else if(i==nums.length-3)
                s[index[i]]="Bronze Medal";
            else 
                s[index[i]]=""+(j+1);
        }
        
        return s;
    }
}