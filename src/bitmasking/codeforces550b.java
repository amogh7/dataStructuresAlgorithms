package bitmasking;

import java.util.Scanner;

import static bitmasking.AvengersEndgame.countSetBits;

public class codeforces550b {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int l=sc.nextInt();
        int r=sc.nextInt();
        int x=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        for(int i=3;i<(1<<n);i++){
            if( countSetBits(i)>=2){
             if(isitSafe(arr,l,r,x,i)) {
                 count++;
             }
             }
        }
        System.out.println(count);

    }
    public static boolean isitSafe(int[] arr,int l,int r,int x,int i){
        int pos=0;
        int ans=0;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        while(i>0){
            if((i&1)==1){

                ans=ans+arr[pos];
                min=Math.min(min,arr[pos]);
                max=Math.max(max,arr[pos]);
            }
            i=i>>1;
            pos++;

        }
        if(max-min>=x && ans<=r && ans>=l){
            return true;
        }
        return false;


    }
}
