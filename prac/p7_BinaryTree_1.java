// Create Binary Tree from Inorder and Preorder.

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

public class p7_BinaryTree_1 {
    int preIndex = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return constructTree(preorder, inorder, 0, inorder.length - 1);
    }

    private TreeNode constructTree(int[] preorder, int[] inorder, int inStart, int inEnd) {
        if (inStart > inEnd) {
            return null;
        }

        TreeNode root = new TreeNode(preorder[preIndex++]);

        int inIndex = findInorderIndex(inorder, inStart, inEnd, root.val);

        root.left = constructTree(preorder, inorder, inStart, inIndex - 1);
        root.right = constructTree(preorder, inorder, inIndex + 1, inEnd);

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
        int[] preorder = { 3, 9, 20, 15, 7 };
        int[] inorder = { 9, 3, 15, 20, 7 };

        p7_BinaryTree_1 treeBuilder = new p7_BinaryTree_1();
        TreeNode root = treeBuilder.buildTree(preorder, inorder);

        System.out.print("Inorder traversal of the constructed tree: ");
        treeBuilder.printInorder(root);
    }
}
