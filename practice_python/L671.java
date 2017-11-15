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
    int min = Integer.MAX_VALUE;
    int secondMin = Integer.MAX_VALUE;
    
    public int findSecondMinimumValue(TreeNode root) {
        if(root==null)
            return -1;
        
        findMinminValue(root);
        return secondMin==Integer.MAX_VALUE?-1:secondMin;
    }
    
    public int  findMinminValue(TreeNode root) {
        if(root==null)
            return -1;
        
        if(root.val<min){
            secondMin = min;
            min = root.val; 
        }
        else if(root.val<secondMin && root.val>min){
            secondMin = root.val;
        }
        return findMinminValue(root.left) + findMinminValue(root.right);
        
        
    }
}