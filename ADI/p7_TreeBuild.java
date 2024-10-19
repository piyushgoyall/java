import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left, right;

    public Node(int value) {
        data = value;
        left = right = null;
    }
}

class Tree {
    Node root;

    Node buildTree(int[] arr) {
        if (arr.length == 0) {
            return null;
        }

        root = new Node(arr[0]);
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        int index = 1;
        while (index < arr.length) {
            Node current = queue.poll();

            if (index < arr.length) {
                current.left = new Node(arr[index++]);
                queue.add(current.left);
            }

            if (index < arr.length) {
                current.right = new Node(arr[index++]);
                queue.add(current.right);
            }
        }
        return root;
    }

    void inorder(Node node) {
        if (node == null) {
            return;
        }
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    void preorder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }

    void postorder(Node node) {
        if (node == null) {
            return;
        }
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data + " ");
    }
}

public class p7_TreeBuild {
    public static void main(String[] args) {
        Tree tree = new Tree();
        int[] arr = { 1, 2, 3, 4, 5 };

        tree.buildTree(arr);

        System.out.print("Inorder traversal: ");
        tree.inorder(tree.root);

        System.out.print("\nPreorder traversal: ");
        tree.preorder(tree.root);

        System.out.print("\nPostorder traversal: ");
        tree.postorder(tree.root);
    }
}
