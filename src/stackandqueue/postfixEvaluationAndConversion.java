package stackandqueue;

import java.util.Scanner;
import java.util.Stack;

public class postfixEvaluationAndConversion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        Stack<Integer> values=new Stack<>();
        Stack<String> pre=new Stack<>();
        Stack<String> in=new Stack<>();


       for(int i=0;i<str.length();i++){
           char ch=str.charAt(i);
           if(ch=='+'||ch=='-'||ch=='*'|| ch=='/'){

               int v2=values.pop();
               int v1=values.pop();
               int ans=operation(v1,v2,ch);
               values.push(ans);

               String p2=pre.pop();
               String p1=pre.pop();
               String ans2=ch+p1+p2;
               pre.push(ans2);

               String i2=in.pop();
               String i1=in.pop();
               String ans3="("+i1+ch+i2+")";
               in.push(ans3);
           }
           else{
               pre.push(ch+"");
               in.push(ch+"");
               values.push(ch-'0');
           }
       }
        System.out.println(values.pop());
        System.out.println(in.pop());
        System.out.println(pre.pop());
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
