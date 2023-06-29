package easy;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class E_0094_BinaryTreeInorderTraversal {

    public static class TreeNode {
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

    private static List<Integer> list ;

//        方法1 ： 基于dfs
//    public void dfs ( TreeNode treeNode  ){
//        if( treeNode == null){
//            return;
//        }
//
//        dfs( treeNode.left);
//        list.add(treeNode.val);
//        dfs (treeNode.right);
//    }
//
//    public List<Integer> inorderTraversal(TreeNode root) {
//        list = new ArrayList<Integer>();
//        dfs ( root );
//        return list;
//    }

    //方法2 使用栈
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while (cur != null || !stack.isEmpty()) {
            if (cur != null) {
                stack.push(cur);
                cur = cur.left;
            } else {
                cur = stack.pop();
                list.add(cur.val);
                cur = cur.right;
            }
        }
        return list;
    }
}
