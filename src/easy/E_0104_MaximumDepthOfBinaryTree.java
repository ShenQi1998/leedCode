package easy;

public class E_0104_MaximumDepthOfBinaryTree {

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public int maxDepth(TreeNode root) {

        if(root == null){
            return 0;
        }

        return maxDepth(root , 1);

    }


    public int maxDepth(TreeNode root , int hight) {

        if(root == null || (root.left == null && root.right == null) ){
            return hight ;
        }

        int left = maxDepth(root.left , hight + 1 );
        int right = maxDepth(root.right , hight + 1 );

        return left>right?left:right;

    }





    }
}
