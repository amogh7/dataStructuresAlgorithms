package ArraysQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class MajorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
//Method 1 brute force 0(nSQUARE) time complexity and O(nSQUARE) SPACE Complexity;
//        boolean flag=false;
//        int count2=0;
//        for(int i=0;i<n;i++){
//
//            int count=0;
//            for(int j=0;j<n;j++) {
//                if (arr[i] == arr[j]) {
//                      count++;
//
//
//                    }
//
//                }
//            if(count>n/2){
//                count2=count;
//                System.out.println(arr[i]);
//                break;
//                }
//
//
//    }
//        if(count2<=n/2)
//        System.out.println("No majority element");
//          }
//Method 2 with  sorting O(LOG N+N)TIME
//        Arrays.sort(arr);
//        int mid=(arr.length-1)/2;
//        int majority=arr[mid];
//         int count=0;
//         for(int i=0;i<n;i++){
//             if(majority==arr[i]){
//                 count++;
//             }
//         }
//         if(count>n/2){
//             System.out.println(arr[mid]);
//         }
//         else {
//             System.out.println("No majority element");
//         }
//Method 3 Moores voting Algorithm
        int major=0;
        int count=1;

        for(int i=0;i<n;i++){
           if(arr[major]==arr[i]){
                count=count+1;
           }
           else{
               count=count-1;
           }
           if(count==0){
               major=i;
               count=1;
           }
        }
        int count2=0;
        for(int i=0;i<n;i++){
            if(arr[major]==arr[i]){
                count2++;
            }

        }
        if(count2>n/2){
            System.out.println(arr[major]);
        }
        else{
            System.out.println("No majority element");
        }


        }
            }






