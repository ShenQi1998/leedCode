package middle;

import java.util.ArrayList;
import java.util.List;

public class M_0199_BinaryTreeRightSideView {

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


    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> integers = new ArrayList<>();
        if(root == null){
            return integers;
        }
        dfs(root , 0 , integers );
        return integers ;
    }

    public static void dfs( TreeNode root , int lenght , ArrayList list ){
        if(root == null)
            return;

        if(list.size() <= lenght )
            list.add(root.val);

        dfs(root.right , lenght + 1 , list);
        dfs(root.left , lenght + 1 , list);

    }

}
