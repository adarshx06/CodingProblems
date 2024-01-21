//Leetcode 117 

/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
       if (root == null) {
            return root;
        }

        // Connect the children of the current node
        if (root.left != null) {
            if (root.right != null) {
                // If both children exist, connect them
                root.left.next = root.right;
            } else {
                // If only the left child exists, find the next right node's child
                Node next = findNextRightNode(root.next);
                root.left.next = next;
            }
        }

        if (root.right != null) {
            // If the right child exists, find the next right node's child
            Node next = findNextRightNode(root.next);
            root.right.next = next;
        }

        // Recursive calls for the right and left subtrees
        connect(root.right);
        connect(root.left);

        return root;
    }

    private Node findNextRightNode(Node node) {
        // Find the next right node that has a child
        while (node != null) {
            if (node.left != null) {
                return node.left;
            }
            if (node.right != null) {
                return node.right;
            }
            node = node.next;
        }
        return null;
    }
}
