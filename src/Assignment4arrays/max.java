package Assignment4arrays;

import java.util.Scanner;

public class max {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(max(arr));
        }
        public static int max(int[] arr){
            int max=0;
            for(int i=0;i<arr.length;i++){
                if(max<arr[i]){
                    max=arr[i];
                }

        }

            return max;
    }
}
