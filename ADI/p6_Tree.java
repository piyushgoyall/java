// Create a Tree
/*
         10
        /   \
       5     6
      / \   / \
     3   2 1   4 
 */

class Node {
    int data;
    Node left;
    Node right;

    Node(int d) {
        this.data = d;
        this.left = null;
        this.right = null;
    }

}

public class p6_Tree {
    static boolean isHeap(Node root) {
        if (root.left == null && root.right == null)
            return true;

        if (root.right == null) {
            return root.left.data <= root.data;
        }

        // assert (root.left != null);

        if (root.left.data <= root.data && root.right.data <= root.data) {
            return isHeap(root.left) && isHeap(root.right);
        } else {
            return false;
        }
    }

    static boolean isComplete(Node root, int i, int count) {
        if (root == null)
            return true;
        if (i >= count)
            return false;

        return isComplete(root.left, 2 * i + 1, count) && isComplete(root.right, 2 * i + 2, count);
    }

    static int countNodes(Node root) {
        if (root == null)
            return 0;

        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    static boolean checkHeap(Node root) {
        int count = countNodes(root);

        return isComplete(root, 0, count) && isHeap(root);
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(2);
        root.right = new Node(6);
        root.right.left = new Node(1);
        root.right.right = new Node(4);

        System.out.println(checkHeap(root));
    }
}
