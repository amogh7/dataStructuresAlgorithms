package stackandqueue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class maximumUsingQueue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        Deque<Integer> queue=new LinkedList<>();
        for(int i=0;i<k;i++){

            while(!queue.isEmpty()&& arr[i]>arr[queue.getLast()]){
                queue.removeLast();
            }
            queue.addLast(i);
        }


        for(int i=k;i<arr.length;i++){

                System.out.println(arr[queue.getFirst()]);


            while(!queue.isEmpty()&& queue.getFirst()<=i-k){
                queue.removeFirst();

            }
            while(!queue.isEmpty()&& arr[i]>arr[queue.getLast()]){
                queue.removeLast();
            }
            queue.addLast(i);

        }

            System.out.println(arr[queue.getFirst()]);

    }
}
