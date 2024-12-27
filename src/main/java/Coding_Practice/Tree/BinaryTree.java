package Coding_Practice.Tree;

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class BinaryTree {
    Node root;

    // Function to find the height of the binary tree
    public int findHeight(Node node) {
        if (node == null) {
            return -1; // Height is -1 for edges-based height
        }

        // Recursively find the height of left and right subtrees
        int leftHeight = findHeight(node.left);
        int rightHeight = findHeight(node.right);

        // Height is 1 + max of leftHeight and rightHeight
        return 1 + Math.max(leftHeight, rightHeight);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Creating a binary tree
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        // Find the height of the tree
        System.out.println("Height of the tree: " + tree.findHeight(tree.root));
    }
}
