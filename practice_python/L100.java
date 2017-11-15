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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        boolean left, right;
        if(p==null && q==null)
            return true;
        
        if((p==null && q!=null)||(p!=null && q==null))
            return false;
        
        if(p.val==q.val){
            left = isSameTree(p.left,q.left);
            right = isSameTree(p.right,q.right);
        }else
            return false;
        return left&&right;
    }
}