package Assignment4arrays;

import java.util.Scanner;

public class reverseOfArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int start=sc.nextInt();
        int end=sc.nextInt();
        reverse(arr,start,end);
        for(int i=start;i<end;i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void reverse(int[] arr,int start,int end) {

       while(start<end){
         int temp=arr[start];
         arr[start]=arr[end];
         arr[start]=temp;
         start++;
         end--;
       }

    }
}
