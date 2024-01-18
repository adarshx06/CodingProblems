class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        postorderTraversalHelper(root, result);
        return result;
    }

    private void postorderTraversalHelper(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }
        postorderTraversalHelper(node.left, result);   // Traverse left subtree
        postorderTraversalHelper(node.right, result);  // Traverse right subtree
        result.add(node.val);  // Visit the current node
    }
}
}
