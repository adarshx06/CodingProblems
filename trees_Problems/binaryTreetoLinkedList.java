class Solution {
    public void flatten(TreeNode root) {
        if(root == null){
            return;
        }
        Stack<TreeNode> st = new Stack();
        st.push(root);
        while(!st.isEmpty()){
            TreeNode curr_node = st.pop();
            if(curr_node.right != null){
                st.push(curr_node.right);
            }
            if(curr_node.left != null){
                st.push(curr_node.left);
            }
            if(!st.isEmpty()){
                curr_node.right= st.peek();
            }
            curr_node.left= null;
        }

    }

}
