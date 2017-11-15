557:
class Solution(object):
    def reverseString(self, s):
        """
        :type s: str
        :rtype: str
        """
        tmp,newStr,i,limit = "","", 0, len(s)-1

        while i<=limit:
          if s[i]== " ":
            newStr = newStr + tmp[::-1]  + " "newStr = ""
        for i in range(len(s),1):
        	newStr = newStr + s[i]
        return newStr
            tmp =""
          else:
            tmp +=  s[i]
            if i==len(s)-1:
              newStr = newStr + tmp[::-1]  
          i +=1

        return newStr


344
class Solution(object):
    def reverseString(self, s):
        """
        :type s: str
        :rtype: str
        """
        newStr = ""
        for i in range(len(s),1):
        	newStr = newStr + s[i]
        return newStr

530:
 
 # Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def getMinimumDifference(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        
