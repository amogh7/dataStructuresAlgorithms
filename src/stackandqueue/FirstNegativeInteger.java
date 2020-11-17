package stackandqueue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class FirstNegativeInteger {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Deque<Integer> q=new LinkedList<>();

        int k=sc.nextInt();
        for(int i=0;i<k;i++){
            if(arr[i]<0){
                q.addLast(i);
            }
        }
        for(int i=k;i<arr.length;i++){
            if(!q.isEmpty()){
                System.out.println(arr[q.getFirst()]);

            }
            else {
                System.out.println("0");
            }
            while(!q.isEmpty()&&q.getFirst()<=i-k){
                q.removeFirst();
            }

            if(arr[i]<0){
                q.addLast(i);
            }

        }
        if(!q.isEmpty()){
            System.out.println(arr[q.getFirst()]);

        }
        else {
            System.out.println("0");
        }


    }
}
