# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def pathSum(self, root: Optional[TreeNode], targetSum: int) -> List[List[int]]:
        ans=[]
        def path(node,s,p):
            if node:
                if node.left is None and node.right is None:
                    if s+node.val==targetSum:
                        p.append(node.val)
                        ans.append(p.copy())
                path(node.left,s+node.val,p+[node.val])
                path(node.right,s+node.val,p+[node.val])
        path(root,0,[])
        return ans