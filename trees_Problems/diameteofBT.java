class Solution {
    int diameter =0;
    public int diameterOfBinaryTree(TreeNode root) {
        
        calculateDepth(root);

        return diameter;
    }
    public int calculateDepth(TreeNode root){
        if(root== null){
            return 0;
        }
        int maxLeft = calculateDepth(root.left);
        int maxRight = calculateDepth(root.right);
        diameter= Math.max(maxLeft+maxRight, diameter);
        return 1+ Math.max(maxRight,maxLeft);

    }
}
