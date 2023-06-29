package middle;

import java.util.ArrayDeque;
import java.util.Deque;

public class M_0227_BasicCalculatorII {
    public static void main(String[] args) {
        calculate("3+5/2");
    }

    public static int calculate(String s) {

        Deque<Integer> stack = new ArrayDeque<Integer>();
        int num = 0 ;
        char lastSymbol = '+';

        for( int i = 0 ; i< s.length() ; i ++){
            char now = s.charAt(i);

            if(now == ' '){
                continue;
            }

            if( Character.isDigit(now) ){
                num = num * 10 + s.charAt(i) - '0';
            }

            if( !Character.isDigit(now) || i == s.length() -1  ){
                switch (lastSymbol){
                    case '+':
                        stack.push(num);
                        break;
                    case '-':
                        stack.push(-num);
                        break;
                    case '*':
                        stack.push(stack.pop() * num ) ;
                        break;
                    case '/':
                        stack.push(stack.pop() / num);
                }

                lastSymbol = now ;
                num = 0 ;
            }

        }

        int ans = 0;
        while (!stack.isEmpty()) {
            int a = stack.pop();
            System.out.println(a);
            ans = ans + a ;
        }

        System.out.println(ans);
        return ans;


    }
}
