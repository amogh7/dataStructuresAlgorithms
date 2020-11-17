package stackandqueue;

import java.util.Scanner;
import java.util.Stack;


public class infixConversions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String exp=sc.nextLine();
        Stack<String> pos=new Stack<>();
        Stack<String> pre=new Stack<>();
        Stack<Character> ops=new Stack<>();
        for(int i=0;i<exp.length();i++){
            char ch=exp.charAt(i);
            if(ch=='('){
                ops.push(ch);

            }
            else if(ch=='+'||ch =='-'|| ch=='*'|| ch=='/'){
                while(ops.size()>0 &&precedence(ch)<=precedence(ops.peek())&&ops.peek()!='('){
                    char op=ops.pop();
                    String v2=pos.pop();
                    String v1=pos.pop();
                    String res=v1+v2+op;
                    pos.push(res);

                    String p2=pre.pop();
                    String p1=pre.pop();
                    String res2=op+p1+p2;
                    pre.push(res2);



                }
                ops.push(ch);

            }
            else if(ch==')'){
                while(ops.peek()!='('){

                    char op=ops.pop();

                    String v2=pos.pop();
                    String v1=pos.pop();
                    String res=v1+v2+op;
                    pos.push(res);

                    String p2=pre.pop();
                    String p1=pre.pop();
                    String res2=op+p1+p2;
                    pre.push(res2);
                }
                ops.pop();


            }
            else{
                pos.push(ch+"");
                pre.push(ch+" ");

            }
        }
        while(ops.size()>0){

            char op=ops.pop();

            String v2=pos.pop();
            String v1=pos.pop();
            String res=v1+v2+op;
            pos.push(res);

            String p2=pre.pop();
            String p1=pre.pop();
            String res2=op+p1+p2;
            pre.push(res2);
        }
        System.out.println(pos.peek());
        System.out.println(pre.peek());

    }
    public static int precedence(char operator){
        if(operator=='/'||operator=='*'){
            return 2;
        }
        else if(operator=='+'||operator=='-'){
            return -1;
        }
        else{
            return 0;
        }
    }
}
