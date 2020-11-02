package patterns;

import java.util.Scanner;

public class fibbonaccipattern {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int val=0;
        while(row<=n){
            int stars=1;
            while(stars<=row){
                System.out.print(fib2(val)+"\t");
                val++;
                stars++;
            }
            System.out.println();
            row++;
        }

    }
    public static int fib(int val ){
        if(val==0||val==1){
            return val;
        }
        return fib(val-1)+fib(val-2);
    }
    public static int fib2(int n){
        int pehla=0;
        int agla=1;
        int milke=0;

        while(n>0){
            milke=pehla+agla;
            pehla=agla;
            agla=milke;
            n--;
        }

        return pehla;

    }
}
