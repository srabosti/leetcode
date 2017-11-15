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
    public int sumOfLeftLeaves(TreeNode root) {
        return sumTree(root, 0);
    }
    
    public int sumTree(TreeNode root,int sum){
        if(root==null)
            return sum;
        
        sum = sumTree(root.left,(root.left!=null && (root.left.left==null&&root.left.right==null))?sum+root.left.val:sum+0);
        sum = sumTree(root.right,sum);
        
        return sum;
    }
}