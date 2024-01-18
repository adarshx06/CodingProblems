class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> results = new ArrayList<>();
        if(root == null){
            return results;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean left_to_right = true;

        while(!queue.isEmpty()){
            int q_size = queue.size();
            List<Integer> currentlevel = new LinkedList<>();
            for(int i =0; i<q_size;i++){
                TreeNode currentNode = queue.poll();
                if(left_to_right){
                    currentlevel.add(currentNode.val);
                }else{
                    currentlevel.add(0,currentNode.val);
                }
                 if (currentNode.left != null) {
                    queue.add(currentNode.left);
                }

                if (currentNode.right != null) {
                    queue.add(currentNode.right);
                }
               
            }
            results.add(currentlevel);
            left_to_right = !left_to_right;
        }
        return results;
        
    }
}
