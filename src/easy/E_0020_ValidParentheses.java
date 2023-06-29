package easy;

import java.util.Stack;

public class E_0020_ValidParentheses {
    public boolean isValid(String s) {
        Stack<String> stack = new Stack<>();

        for(int i = 0 ; i < s.length() ; i ++ ){
            String now = s.substring(i, i +1);
            if( "(".equals(now) ||  "[".equals(now) || "{".equals(now) ){
                stack.push(now);
            }else if ( ")".equals(now) ||  "]".equals(now) || "}".equals(now) ) {
                if(stack.size() == 0 ){
                    return false;
                }
                if (")".equals(now)) {
                    if (!stack.pop().equals("(")) {
                        return false;
                    }
                } else if ("]".equals(now)) {
                    if (!stack.pop().equals("[")) {
                        return false;
                    }
                } else if ("}".equals(now)) {
                    if (!stack.pop().equals("{")) {
                        return false;
                    }
                }
            }

        }

        if(stack.size() != 0){
            return false;
        }

        return  true;

    }
}
