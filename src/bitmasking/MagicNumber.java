package bitmasking;

import java.util.Scanner;

public class MagicNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=0;
        int mult=5;
        while(n>0){
            ans=ans+(n&1)*mult;
            n=(n>>1);
            mult=mult*5;
        }
        System.out.println(ans);
    }
}
