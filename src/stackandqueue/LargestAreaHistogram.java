package stackandqueue;

import java.util.Scanner;
import java.util.Stack;

public class LargestAreaHistogram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long arr[]=new long[n];
        for(int i=0;i<arr.length;i++){//O(NSQUARE) TIME Another way can be taking count of
                                        //  rectangles equal or greater from current building and
                                         // multiplying  count by height of current bulding else  any smaller
                                          // bulding comes break
            arr[i]=sc.nextLong();
        }
//           int maxArea=0;
//        int height=0;
//        for (int i=0;i<n;i++){
//            height=arr[i];
//            maxArea=Math.max(maxArea,height);
//
//            for(int j=i+1;j<n;j++){
//                height=Math.min(height,arr[j]);
//                maxArea=Math.max(maxArea,height*j-i+1);
//            }
//        }
//        System.out.println(maxArea);
//
        Stack<Integer> stack=new Stack<>();
        int sr[]= new int[n];
        sr[sr.length-1]=sr.length;
        stack.push(arr.length-1);
        for(int i=arr.length-2;i>=0;i--){
        while(!stack.isEmpty()&&arr[i]<=arr[stack.peek()]){
            stack.pop();
        }
        if(stack.isEmpty()){
            sr[i]=arr.length;
        }
        else{
            sr[i]=stack.peek();
        }
        stack.push(i);
        }

        int sl[]=new int[n];
        stack=new Stack<>();
        sl[0]=-1;
        stack.push(0);
        for(int i=1;i<arr.length;i++){
            while(!stack.isEmpty()&&arr[i]<=arr[stack.peek()]){
                stack.pop();
            }
            if(stack.isEmpty()){
                sl[i]=-1;
            }
            else{
                sl[i]=stack.peek();
            }
            stack.push(i);
        }

        long maxArea=0;

        for(int i=0;i<arr.length;i++){


          long  width=sr[i]-sl[i]-1;
           long area=arr[i]*width;
            if(maxArea<area){
                maxArea=area;
            }

        }
        System.out.println(maxArea);




        

    }
}
