// Binary Tree from Inorder and Postorder.

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class p8_BinaryTree_2 {
    int postIndex;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        postIndex = postorder.length - 1;
        return constructTree(inorder, postorder, 0, inorder.length - 1);
    }

    private TreeNode constructTree(int[] inorder, int[] postorder, int inStart, int inEnd) {
        if (inStart > inEnd) {
            return null;
        }

        TreeNode root = new TreeNode(postorder[postIndex--]);

        int inIndex = findInorderIndex(inorder, inStart, inEnd, root.val);

        root.right = constructTree(inorder, postorder, inIndex + 1, inEnd);
        root.left = constructTree(inorder, postorder, inStart, inIndex - 1);

        return root;
    }

    private int findInorderIndex(int[] inorder, int start, int end, int value) {
        for (int i = start; i <= end; i++) {
            if (inorder[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public void printInorder(TreeNode root) {
        if (root != null) {
            printInorder(root.left);
            System.out.print(root.val + " ");
            printInorder(root.right);
        }
    }

    public static void main(String[] args) {
        int[] inorder = { 9, 3, 15, 20, 7 };
        int[] postorder = { 9, 15, 7, 20, 3 };

        p8_BinaryTree_2 treeBuilder = new p8_BinaryTree_2();
        TreeNode root = treeBuilder.buildTree(inorder, postorder);

        System.out.print("Inorder traversal of the constructed tree: ");
        treeBuilder.printInorder(root);
    }
}
