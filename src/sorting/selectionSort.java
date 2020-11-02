package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class selectionSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++){
            int max=0;
            for(int j=0;j<=n-i-1;j++){
                if(arr[j]>arr[max]){
                    max=j;
                }

            }
            int temp=arr[n-i-1];
            arr[n-i-1]=arr[max];
            arr[max]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
