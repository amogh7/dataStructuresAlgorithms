package Assignment4arrays;

import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        System.out.println(BinarySearch(arr,m));
    }
    public static int BinarySearch(int[] arr,int m){
        int l=0;
        int h= arr.length;

        for (int i = 0; i <arr.length ; i++) {
            int mid=l+(h-l)/2;
            if(arr[mid]==m){
                return mid;
            }
            else if(arr[mid]<=m){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return -1;
    }
}
