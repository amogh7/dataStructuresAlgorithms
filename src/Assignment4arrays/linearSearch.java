package Assignment4arrays;

import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] arr=new int[n];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        System.out.println(linearSearch(arr,m));

    }
    public static int linearSearch(int[] arr,int n) {

        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==n){
                return i;

        }
    }
        return -1;
    }
}
