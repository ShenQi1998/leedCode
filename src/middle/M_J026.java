package middle;

public class M_J026 {


    public static void main(String[] args) {
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        b.left = a ;
        b.right = c ;
        c.right = d ;

        TreeNode a1 = new TreeNode(3);

        isSubStructure(b , a1 );

    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static boolean isSame(TreeNode A , TreeNode B){
        if(B == null) return true;
        if( A == null  || A.val != B.val ) return false;
        return ( isSame(A.left,B.left) && isSame(A.right,B.right)  )  ;
    }

    private  static boolean findFlag ;

    public static TreeNode dfs(TreeNode A , TreeNode B){

        if( A == null  || findFlag)
            return null;

        if(isSame(A , B)){
            findFlag = true;
            return null ;
        }

        TreeNode leftTree = dfs(A.left , B);
        if(leftTree != null)
            return leftTree ;

        TreeNode rightTree = dfs(A.right , B);
        return rightTree ;

    }

    public static boolean isSubStructure(TreeNode A, TreeNode B) {
        if(B == null)
            return false;
        findFlag= false;
        dfs(A, B);
        return findFlag;
    }


}
