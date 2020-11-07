package stackandqueue;

import java.util.Scanner;
import java.util.Stack;
public class stockSpan {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Stack<Integer> stack=new Stack<>();
        int[] span=new int[n];
        span[0]=1;
        stack.push(0);
        for(int i=1;i<n;i++){
     while(!stack.isEmpty()&&arr[i]>arr[stack.peek()]){
           stack.pop();

     }
     if(stack.isEmpty()){
         span[i]=i+1;

     }
     else {
         span[i]=i-stack.peek();
     }
     stack.push(i);
        }
        for(int i=0;i<n;i++){
            System.out.print(span[i]+" ");
        }

    }
}
