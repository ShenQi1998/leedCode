package middle;


//递归
// 验证左节点， 验证当前节点是不是最小值  ，验证右节点 。
// 如果当前节点不是最小值 ， 直接 return false;
// 返回 左 && 右


public class M_0098_ValidateBinarySearchTree {


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
    }

    public static void main(String[] args) {
        double a = 8 ;
        System.out.println(Math.log(a) / Math.log(2) );
    }

    int minValue =  Integer.MIN_VALUE;
    boolean firstFlag = true;  ////排除根节点是 Integer.MIN_VALUE 的情况
    public boolean isValidBST(TreeNode root) {
        if(root == null){
            return true ;
        }
        boolean f1 = isValidBST(root.left);
        if(minValue < root.val || firstFlag == true){
            minValue= root.val ;
            firstFlag = false;
        }else{
            return false;
        }
        boolean f2 = isValidBST(root.right);

        return f1 && f2 ;


    }
}
