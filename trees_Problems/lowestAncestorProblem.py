class Solution(object):
    def lowestCommonAncestor(self, root, p, q):
        """
        :type root: TreeNode
        :type p: TreeNode
        :type q: TreeNode
        :rtype: TreeNode
        """
        if root is None or root == p or root==q:
            return root
        
        left_call = self.lowestCommonAncestor(root.left, p, q)
        right_call = self.lowestCommonAncestor(root.right, p, q)


        if left_call and right_call:
            return root
        
        if left_call:
            return left_call
        else:
            return right_call
        
