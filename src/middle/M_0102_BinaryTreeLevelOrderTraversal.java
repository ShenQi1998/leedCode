package middle;

import java.util.*;

//经典：层序输出二叉树
public class M_0102_BinaryTreeLevelOrderTraversal {
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

    // 方法 1 BFS
//    private  static Map<Integer , List<Integer>> m ;
//    public  static  void dfs (TreeNode treeNode , int floor ){
//        if(treeNode == null){
//            return;
//        }
//        List<Integer> nowList = new ArrayList<Integer>();
//        if ( m.get(floor) != null ){
//            nowList = m.get(floor);
//        }
//
//        nowList.add(treeNode .val);
//        m.put(floor , nowList);
//        dfs(treeNode.left ,  floor + 1 );
//        dfs(treeNode.right ,floor + 1);
//
//    }
//
//    public List<List<Integer>> levelOrder(TreeNode root) {
//        m = new HashMap();
//        dfs(root , 0 );
//        int start = 0 ;
//
//        List<List<Integer>> lists = new ArrayList();
//        while( m.containsKey(start) ){
//            lists.add(m.get(start));
//            start ++ ;
//        }
//        return lists;
//    }


    // 方法2 使用队列
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        if (root == null) {
            return ret;
        }

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> level = new ArrayList<Integer>();
            int currentLevelSize = queue.size();
            for (int i = 1; i <= currentLevelSize; ++i) {
                TreeNode node = queue.poll();
                level.add(node.val);
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            ret.add(level);
        }

        return ret;
    }
}
