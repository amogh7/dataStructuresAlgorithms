
package stackandqueue;
import java.util.Scanner;
import java.util.Stack;

public class balancedParenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

    }
        public static  boolean isBalanced(String str) {
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (str.charAt(i) == '[' || str.charAt(i) == '(' || str.charAt(i) == '{') {
                    stack.push(ch);
                } else if (ch == ']') {
                    if (stack.isEmpty()) {
                        return false;
                    } else if (stack.peek() != '[') {
                        return false;
                    } else {
                        stack.pop();
                    }
                } else if (ch == '}') {
                    if (stack.isEmpty()) {
                        return false;
                    } else if (stack.peek() != '{') {
                        return false;
                    } else {
                        stack.pop();
                    }
                } else if (ch == ')') {
                    if (stack.isEmpty()) {
                        return false;
                    } else if (stack.peek() != '(') {
                        return false;
                    } else {
                        stack.pop();
                    }
                } else {

                }
            }
            if(stack.isEmpty()){
                return true;
            }
            else{
                return false;
            }

}
}