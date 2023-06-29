package middle;



public class M_J028 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }


    public boolean isSame (TreeNode A , TreeNode B){
        if(A == null && B == null)
            return true;
        if(A == null || B == null || A.val != B.val)
            return false;
        return isSame( A.left , B.right) && isSame(A.right , B.left);
    }

    public boolean isSymmetric(TreeNode root) {
        if(root == null)
            return true;
        return isSame(root.left ,root.right);
    }
}
