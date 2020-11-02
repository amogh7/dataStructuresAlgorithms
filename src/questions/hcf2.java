package questions;

import java.util.Scanner;

public class hcf2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int j=0;j<n;j++){
            arr[j]=sc.nextInt();
        }
        int first=arr[0];
        int hcf=0;
        int i=1;
        while(i<n){
            hcf=gcd(first,arr[i]);
            i++;
            if(hcf==1){
                System.out.println(1);
            }
        }
        System.out.println(hcf);

    }
    public static int gcd(int n,int m){
        int i=1;
        int hcf=0;
        while(i<=n&&i<=m){
            if(n%i==0&&m%i==0){
                hcf=i;
                i++;
            }

        }
        return hcf;
    }
}
