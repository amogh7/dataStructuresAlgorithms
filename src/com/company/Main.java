package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(max1(0,arr,arr[0]));

    }
    public static int max1(int index,int[]arr,int max) {
        if (index == arr.length-1) {
            return max;
        }

        if (arr[index] > arr[index + 1]){
            max = arr[index];
         }

        max= max1(index+1,arr,max);
        return max;



    }
}
