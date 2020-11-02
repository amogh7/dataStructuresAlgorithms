package questions;

import java.util.Scanner;

public class DivisibleSubArrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=0;
        while(k<n){
            int m=sc.nextInt();
            long[] arr=new long[m];
            for(long i=0;i<m;i++){
                arr[(int) i]=sc.nextLong();
            }
            k++;
            long[] pre=new long[m];
            long sum=0;
            pre[0]=1;
            for(int i=0;i<m;i++){
                sum=sum+arr[i];
                sum=sum%m;
                sum=(sum+m)%m;
                pre[(int) sum]++;
            }
            long total=0;
            for(int i=0;i<m;i++){
                if(pre[i]>=2){
                    total=total+pre[i]*(pre[i]-1)/2;

                }

            }
            System.out.println(total);

        }
    }
}