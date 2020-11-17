package stackandqueue;

import java.util.Scanner;
import java.util.Stack;

public class prefixEvaluationAndConversion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

       Stack<Integer> values=new java.util.Stack<>();
       Stack<String> pos=new java.util.Stack<>();
        Stack<String> in=new Stack<>();


        for(int i=str.length()-1;i>=0;i--){
            char ch=str.charAt(i);
            if(ch=='+'||ch=='-'||ch=='*'|| ch=='/'){

                int v1=values.pop();
                int v2=values.pop();
                int ans=operation(v1,v2,ch);
                values.push(ans);

                String p1=pos.pop();
                String p2=pos.pop();
                String ans2=p1+p2+ch;
                pos.push(ans2);

                String i1=in.pop();
                String i2=in.pop();
                String ans3="("+i1+ch+i2+")";
                in.push(ans3);
            }
            else{
                pos.push(ch+"");
                in.push(ch+"");
                values.push(ch-'0');
            }
        }
        System.out.println(values.pop());
        System.out.println(in.pop());
        System.out.println(pos.pop());
    }
    public static int operation(int val1,int val2,char operator){
        if(operator=='+'){
            return val1+val2;
        }
        else if (operator=='-'){
            return val1-val2;
        }
        else if(operator=='*'){
            return val1*val2;

        }
        else{
            return  val1/val2;
        }
    }
}
