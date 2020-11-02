package ArraysQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class RainWaterProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        int totalWater=0;
        for (int i = 1; i <arr.length-1 ; i++) {
            int rightMax=0;
             for(int j=i;j<arr.length;j++) {
                 if (arr[j] > rightMax) {
                     rightMax = arr[j];
                 }
             }
              int leftMax =0;
                 for(int k=i;k>=0;k--){
                     if(arr[k]>leftMax){
                         leftMax=arr[k];
                     }


             }
                 totalWater=totalWater+Math.min(leftMax,rightMax)-arr[i];
             }
        System.out.println(totalWater);
//   Efficient Method-
//        int[] rightMax = new int[n];
//        int[] leftMax = new int[n];
//        rightMax[0]=arr[0];
//        for (int i = 1; i < n; i++) {
//            if (arr[i] > rightMax[i - 1]) {
//                rightMax[i] = arr[i];
//            } else {
//                rightMax[i] = rightMax[i - 1];
//            }
//        }
//        System.out.println(Arrays.toString(rightMax));
//        leftMax[n-1]=arr[n-1];
//        for (int i = n - 2; i >= 0; i--) {
//            if (arr[i] > leftMax[i +1]) {
//                leftMax[i] = arr[i];
//            } else {
//                leftMax[i] = leftMax[i+1];
//            }
//        }
//        System.out.println(Arrays.toString(leftMax));
//        int totalWater=0;
//        for(int i=1;i<n-1;i++){
//            totalWater=totalWater+Math.min(rightMax[i],leftMax[i])-arr[i];
//        }
//       System.out.println(totalWater);
    }
}