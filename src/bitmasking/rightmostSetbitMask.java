package bitmasking;

import java.util.Scanner;

public class rightmostSetbitMask {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int mask=(n&(-n));//n&(~n+1) this mean n& 2s complement of n


        // right most set bit index
        int m=sc.nextInt();
        int count=1;
        int mask2=1;
        while((m&mask2)==0){
          count++;
          mask2=mask2<<1;
        }
        System.out.println(count);


    }
}
