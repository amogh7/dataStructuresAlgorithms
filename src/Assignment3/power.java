package Assignment3;

import java.util.Scanner;

public class power {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    Long n=sc.nextLong();
    Long m=sc.nextLong();
    long mult=1;
    long ans=0;
    for(int i=1;i<=m;i++){
       ans=n*mult;
        mult=mult*n;
    }
        System.out.println(ans);
    }
}
