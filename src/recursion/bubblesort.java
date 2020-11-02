package recursion;

import java.util.Scanner;

public class bubblesort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sort(arr,n-1,0);
     for(int i=0;i<n;i++ ){
         System.out.print(arr[i]+" ");
     }
    }
    public static void sort(int[] arr,int row,int col){
        if(row==0){
          return;
        }
        if(row==col){
            sort( arr,row-1,0);
            return;
        }
        if(arr[col]>arr[col+1]){
            int temp=arr[col];
            arr[col]=arr[col+1];
            arr[col+1]=temp;
        }
        sort(arr,row,col+1);
    }
}
