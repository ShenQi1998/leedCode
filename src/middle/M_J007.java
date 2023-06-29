package middle;

import java.util.HashMap;

//经典题目，根据前序和中序建树

public class M_J007 {

    private static HashMap<Integer ,Integer> m ;

    public static void main(String[] args) {
        int[] ints1 = new int[]{3,9,20,15,7};
        int[] ints2 = new int[]{9,3,15,20,7};
        buildTree(ints1 , ints2);
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    private static TreeNode dfs( int[] preorder, int[] inorder , int preStart , int preEnd , int inStart , int inEnd ){

        if(preStart >= preEnd){
            return null;
        }

        TreeNode treeNode = new TreeNode(preorder[preStart]);

        //中序输出根节点下标
        int inIndex = m.get(preorder[preStart]);

        treeNode.left = dfs(preorder , inorder ,preStart + 1 , preStart + inIndex - inStart , inStart , inIndex- 1  );
        treeNode.right = dfs(preorder , inorder ,preStart + inIndex - inStart + 1 , preEnd , inIndex + 1  , inEnd );

        return treeNode;
    }


    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        m = new HashMap<Integer,Integer>();
        int n = inorder.length;

        for(int i = 0; i < n ; i ++){
            m.put( inorder[i]  , i);
        }


        return dfs(preorder ,  inorder , 0 ,n-1 , 0 , n-1);

    }

}
