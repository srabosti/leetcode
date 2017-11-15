class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> s = new HashSet<Integer>();
        HashSet<Integer> intersect = new HashSet<>();
        
        for(int i=0;i<nums1.length;i++){
            s.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            if(s.contains(nums2[i])){
                intersect.add(nums2[i]);
            }
        }
        
        int[] number = new int[intersect.size()];
        int k=0;
        
        for(Integer num:intersect){
            number[k++]=num;
        }
        return number;
        
    }
}