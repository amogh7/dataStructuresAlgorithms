package recursion;

import java.util.Scanner;

public class isArraySorted {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(isArraySorted(arr,0));
    }
    public static boolean isArraySorted(int[] arr,int index){
        if(index== arr.length-1){
            return true;
        }
        if(arr[index]>arr[index+1]){
            return false;
        }
        return isArraySorted(arr,index+1);
    }
}
