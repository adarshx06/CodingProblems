//Populating Next Right Pointers in Each Node
//o(n)

class Solution {
    public Node connect(Node root) {
        if(root == null){
            return root;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int level =queue.size();
            for(int i =0; i<level;i++){
                Node curr_node = queue.poll();
                Node nxt = i < level - 1 ? queue.peek() : null;
                curr_node.next = nxt;
                if (curr_node.left != null) {
                    queue.add(curr_node.left);
                }
                if (curr_node.right != null) {
                    queue.add(curr_node.right);
                }                

            }
        }
        return root;

    }
}


//o(1) recursion
class Solution {
    public Node connect(Node root) {
        if(root == null){
            return root;
        }
        if(root.left!=null){
            root.left.next= root.right;
            if(root.next!=null){
                root.right.next = root.next.left;
            }
        }

        connect(root.left);
        connect(root.right);
        
        return root;

    }
}






