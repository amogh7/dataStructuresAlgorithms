package stackandqueue;

import java.util.Scanner;
import java.util.Stack;

public class celebrityProblem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][] =new int[n][m];
        for(int i=0;i<n;i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
            Stack<Integer> stack=new Stack<>();
            for(int i=0;i<arr.length;i++){
                stack.push(i);
            }

            while(stack.size()>=2){
                int num1=stack.pop();
                int num2=stack.pop();
                if(arr[num1][num2]==0){
                    stack.push(num1);
                }
                else {
                    stack.push(num2);
                }
            }
            int pot=stack.pop();
            for(int i=0;i<arr.length;i++){
                if(i!=pot) {
                    if (arr[pot][i] ==1||arr[i][pot]==0){
                        System.out.println("none");
                        return;
                    }
                }
            }
        System.out.println(pot);



    }
}
