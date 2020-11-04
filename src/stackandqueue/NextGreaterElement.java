package stackandqueue;

import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int [] nge=new int[n];
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && arr[i]>arr[stack.peek()]) {//this condition can not be written in if statement
                                                                   // it will cause infinite loop otherwise
                int pos=stack.peek();
                int rv = stack.pop();

                nge[pos]=arr[i];
            }
            stack.push(i);
        }


        while(!stack.isEmpty()){
            int pos=stack.peek();
            int rv=stack.pop();
            nge[pos]=-1;
        }

        for(int i=0;i<n;i++){
            System.out.print(nge[i]+" ");
        }
//        Scanner sc=new Scanner(System.in);//for circular Array for normal arraya first add last element to array
//        int n=sc.nextInt();
//        int[] arr=new int[n];
//        for(int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
//        int nge[]=new int[n];
//        Stack<Integer> stack=new Stack<>();
//        for(int i=2*arr.length-1;i>=0;i--){
//            while(!stack.isEmpty()&&arr[i%arr.length]>=stack.peek()){
//                stack.pop();
//            }
//            if(stack.isEmpty()){
//                nge[i%arr.length]=-1;
//            }
//            else{
//                nge[i%arr.length]=stack.peek();
//
//
//            }
//            stack.push(arr[i%arr.length]);
//        }
//        for(int i=0;i<nge.length;i++){
//            System.out.print(nge[i]+" ");
//        }





        }






}
