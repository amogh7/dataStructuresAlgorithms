package stackandqueue;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
public class mergeOverlappingArrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Pair> stack=new Stack<>();
        int n=sc.nextInt();
        Pair[] arr=new Pair[n];
        for(int i=0;i<n;i++){
            int st=sc.nextInt();
            int et=sc.nextInt();
            arr[i]=new Pair(st,et);
        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(stack.isEmpty()) {
                stack.push(arr[i]);
            }
           else if(arr[i].st>stack.peek().et){
                stack.push(arr[i]);
            }
            else{
                stack.peek().et=Math.max(stack.peek().et,arr[i].et);
            }
        }
        Stack <Pair>helper=new Stack();
        while(stack.isEmpty()==false){

        helper.push(stack.pop());
        }
        while(helper.isEmpty()==false){
            Pair temp=helper.pop();
            System.out.println(temp.st+" "+ temp.et);
        }
    }
 public static class Pair implements Comparable<Pair>{
        int st;
        int et;
        Pair(int st ,int et){
            this.st=st;
            this.et=et;
        }

     @Override
     public int compareTo(Pair o) {
            if(this.st!=o.st){
                return this.st-o.st;
            }
            else{
                return this.et-o.et;
            }
     }
 }

}

