
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        preorderTraversalHelper(root, result);
        return result;
    }

    private void preorderTraversalHelper(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }
        result.add(node.val);  // Visit the current node
        preorderTraversalHelper(node.left, result);   // Traverse left subtree
        preorderTraversalHelper(node.right, result);  // Traverse right subtree
    }
}
