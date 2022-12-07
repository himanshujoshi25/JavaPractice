package leetcode;
public class FlattenBinaryTree {

    public void flatten(TreeNode root) {

        if(root == null) return;
        TreeNode right = root.right;

        flatten(root.left);
        root.right = root.left;
        root.left = null;

        while(root.right != null) root = root.right;
        flatten(right);
        root.right = right;
    }
}
