/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        
        return makeBST456(0,nums.length-1, nums);
    }
    
    public TreeNode makeBST456(int start, int end, int[] nums){
        if(nums.length==0 || start>end)
            return null;
        
        int mid = (start+end)/2;
        
        TreeNode t = new TreeNode(nums[mid]);
   
        t.left = makeBST(start,mid-1,nums);
        t.right = makeBST(mid+1,end,nums);
        
        return t;
    }
}