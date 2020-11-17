package stackandqueue;

import java.util.Scanner;
import java.util.Stack;

public class infix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> operands=new Stack<>();
        Stack<Character> operators=new Stack<>();
        String exp=sc.nextLine();


        for(int i=0;i<exp.length();i++){
            char element=exp.charAt(i);
            if(element =='('){
                operators.push(element);
            }
            else if(element==')'){
                while(operators.peek()!='(') {
                    char operator = operators.pop();
                    int v2 = operands.pop();
                    int v1 = operands.pop();

                    int opv = calculation(v1, v2, operator);
                    operands.push(opv);

                }
                operators.pop();
            }
            else if(element=='+'||element=='-'||element=='*'|| element=='/'){
                while(operators.size()>0&& operators.peek()!='('&&
                        precedence(element)<=precedence(operators.peek())){
                      char operator=operators.pop();
                      int v2=operands.pop();
                      int v1=operands.pop();
                      int opv=calculation(v1,v2,operator);
                      operands.push(opv);
                }
                //element was waiting for previous to get solve
                   operators.push(element);

            }
            else{
                operands.push(element-'0');
            }
        }
        while(operators.size()!=0){
            char operator = operators.pop();
            int v2 = operands.pop();
            int v1 = operands.pop();

            int opv = calculation(v1, v2, operator);
            operands.push(opv);

        }
        System.out.println(operands.peek());



    }
    public static int precedence(char operator){
        if(operator=='*'){
            return 2;
        }
        else if(operator=='/'){
            return 2;
        }
        else if(operator=='+'){
            return 1;
        }
        else{
            return 1;
        }
    }
    public static int calculation(int val1 ,int val2,char operator){
        if(operator=='*'){
            return val1*val2;
        }
        else if(operator=='/'){
            return val1/val2;
        }
        else if(operator=='+'){
            return val1+val2;
        }
        else{
            return val1-val2;
        }
    }
}
