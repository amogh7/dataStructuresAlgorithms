package Assignment4arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class inverseOfArray {

    public static void main(String[] args) {
        ArrayList<Integer> narr=new ArrayList<>();

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] inv=new int[n];
        inverse(n-1,arr,inv);
        for(int i=0;i<n;i++){
        System.out.print(inv[i]);
    }
//
//        for(int i=0;i<=n-1;i++){
//           int v=arr[i];
//           inv[v] =i;
//        }
//        for(int i=0;i<n;i++){
//        System.out.print(inv[i]);
//    }


    }
    public static void inverse(int i,int[] arr,int[] inv){
        if(i==0){
            return ;
        }


        int v=arr[i];
        inv[v]=i;

        inverse(i-1,arr,inv);
    }
}
