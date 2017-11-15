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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> l = new ArrayList<List<Integer>>();
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        if(root==null)
            return l;
        
        q.offer(root);
        
        while(!q.isEmpty()){
            int size= q.size();
            List<Integer> newList = new ArrayList<Integer>();
            
            for(int i=0;i<size;i++){
                if(q.peek().left!=null)q.offer(q.peek().left);
                if(q.peek().right!=null)q.offer(q.peek().right);
                
                newList.add(q.poll().val);
            }
            l.add(0,newList);
        }
        return l;
    }
}