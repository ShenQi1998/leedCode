package middle;

import java.util.Stack;

public class M_0071_SimplifyPath {
    public static void main(String[] args) {
//        String A = "A/B/CC//D/";
//        String[] split = A.split("/");
//        for (String s : split) {
//            System.out.println(s);
//        }

        String path = "/a/./b/../../c/";
        String a = simplifyPath(path);
        System.out.println(a);
    }

    public static String simplifyPath(String path) {
        String[] split = path.split("/");
        Stack<String> stack = new Stack<>();

        for (String s : split) {
            if( s.equals(".") ||s.equals("") ){
                continue;
            }

            if( s.equals("..")  ){
                if(stack.size() != 0){
                    stack.pop();
                }
            }else{
                stack.push(s);
            }


        }

        StringBuilder sb = new StringBuilder();
        while( stack.size() != 0 ){

            sb.insert( 0, "/" + stack.pop() );
        }

        return "".equals(sb.toString() )? "/": sb.toString();
    }
}
