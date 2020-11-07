package stackandqueue;
import java.util.Stack;

import java.util.Scanner;

public class maximumInWindow {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int nge[]=new int [n];
        Stack<Integer> stack=new Stack<>();
        nge[arr.length-1]=arr.length;
        for(int i=arr.length-2;i>=0;i--){
            while(!stack.isEmpty()&&arr[i]>=stack.peek()){
                stack.pop();
            }
            if(stack.isEmpty()){
                nge[i]=arr.length;
            }
            else{
                nge[i]=stack.peek();
            }
               stack.push(i);
        }
        int j=0;
        for(int i=0;i<nge.length-k;i++){
            if(j<i){
                j=i;
            }
            while(nge[j]<i+k){
                j=nge[j];
            }
            System.out.println(j);

        }


    }
}
