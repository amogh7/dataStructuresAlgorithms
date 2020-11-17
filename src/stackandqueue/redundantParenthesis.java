package stackandqueue;

import java.util.Scanner;
import java.util.Stack;

public class redundantParenthesis {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        Stack<Character> stack=new Stack<>();

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==')'){
                if(stack.peek()=='('){
                    System.out.println("True");
                    return;
                }
                else{
                    while(stack.peek()!='('){
                        stack.pop();
                    }
                    stack.pop();
                }
            }
            else{
                stack.push(str.charAt(i));
            }
        }
        System.out.println(false);


    }
}
