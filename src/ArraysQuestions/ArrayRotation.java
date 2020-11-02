package ArraysQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {//Approach -1 O(n)+O(d) time complexity and space complexity
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
           int[] arr=new int[n];
           for(int i=0;i<n;i++){
             arr[i]=sc.nextInt();
   }
            int d=sc.nextInt();

//        int[] temp=new int[d];
//        for(int i=0;i<d;i++){
//            temp[i]=arr[i];
//        }
//        for(int i=0;i<=n-d-1;i++){
//            arr[i]=arr[d+i];
//        }
//        for(int i=n-d;i<n;i++){
//            arr[i]=temp[i-n+d];
//        }
//        System.out.println(Arrays.toString(arr));
//Method 2-
//        for(int i=0;i<d;i++){ //Method 2 space reduced to n; time complexity is increased O(n*d);
//            rotate1(arr);
//
//        }
//        System.out.print(Arrays.toString(arr));
//
//
//
//    }
//    public static void rotate1(int[] arr){
//        int temp=arr[0];
//        for(int i=0;i<arr.length-1;i++){
//            arr[i]=arr[i+1];
//        }
//            arr[arr.length-1]=temp;
//Method 3
        reverse(arr,0,d-1);
        reverse(arr,n-d-1,n-1);
        reverse(arr,0,n-1);
        System.out.print(Arrays.toString(arr));


    }
    public static void reverse(int arr[],int start ,int end){

        while(start<end){
           int temp= arr[start];
           arr[start]=arr[end];
           arr[end]=temp;
           start++;
           end--;
        }
    }
}
