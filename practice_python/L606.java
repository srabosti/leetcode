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
    
    public String tree2str(TreeNode t) {
        String str="";
         if(t==null)
            return str;
        return createTree(t,str);
        
    }
    public String createTree(TreeNode t,String str){
        str= str + ""+t.val;
        if(t.left==null && t.right==null){
            return str;
        }  
        if(t.left!=null){
            str=str+"(";
            str = createTree(t.left,str);
            str=str+")";
        }
        if(t.left==null&&t.right!=null){
            str=str+"()";
        }
        if(t.right!=null){
            str=str+"(";
            str = createTree(t.right,str);
            str=str+")";
        }
        return str;
    }
}