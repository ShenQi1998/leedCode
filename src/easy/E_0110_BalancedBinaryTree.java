package easy;

public class E_0110_BalancedBinaryTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean isBalanced(TreeNode root) {
        if (maxDepth(root) == -1) {
            return false;
        }
        return true;
    }


    public int maxDepth(TreeNode root ) {
        if (root == null) {
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        if(left > -1 && right > -1 && Math.abs(left - right) <= 1){
            return Math.max(left, right) + 1;
        }
        return -1;
    }

}
