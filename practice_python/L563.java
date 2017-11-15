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
    int result =0;
    public int findTilt(TreeNode root) {
        preOrder(root);
        return result;
    }
    
    public int preOrder(TreeNode root){
        int ltilt,rtilt;
        if(root==null)
            return 0;
        
        ltilt = preOrder(root.left);
        rtilt = preOrder(root.right);
        
        result +=Math.abs(ltilt-rtilt);
        return ltilt+rtilt+root.val;
    }
}