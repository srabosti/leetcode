# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def averageOfLevels(self, root):
        """
        :type root: TreeNode
        :rtype: List[float]
        """
        info = []
        def avglevel(root,depth=0):
            if root is None:
                return
            if len(info)<=depth:
                info.append([0,0])
            info[depth][0] += root.val
            info[depth][1] +=1
            
            avglevel(root.left,depth+1)
            avglevel(root.right,depth+1)
            
        avglevel(root)
         
        return [v/float(n) for v,n in info] 
        