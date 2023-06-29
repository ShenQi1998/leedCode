package hard;

/*
             D
            /
           A
         /   \
        B     C

定义全局变量 MAX , 记录最大值
计算当前节点（B - A - C）的值 ,如果比 MAX 还大则替换MAX
递归调用：返回值为 B-A 和 C-A 中 大的值

*/

public class H_0124_BinaryTreeMaximumPathSum {

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


    private static Integer maxValue = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        if(root == null )
            return 0 ;
        maxValue = root.val;
        dfs(root);
        return maxValue ;
    }

    public static int dfs(TreeNode root){
         if(root == null)
            return 0;
         int leftMax = Math.max(0 , dfs(root.left) );
         int rightMax =  Math.max(0 ,dfs(root.right));
         int sum = leftMax + rightMax + root.val;
         if(sum > maxValue )
             maxValue = sum ;
         return root.val + Math.max(leftMax , rightMax) ;
    }

}
