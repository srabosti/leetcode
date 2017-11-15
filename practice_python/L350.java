class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int match=0;
        
        for(int i=0,j=0;i<nums1.length&&j<nums2.length;){

            if(nums1[i]<nums2[j]) i++;
            else if(nums1[i]>nums2[j]) j++;
            else
            { 
                arr.add(nums1[i]);
                i++;
                j++;
            }
        }
        
        int[] copyArr = new int[arr.size()];
        for(int i=0;i<copyArr.length;i++){
            copyArr[i] = arr.get(i);
        }
        return copyArr;
    }
}