package Assignment3;

import java.util.Scanner;

public class printSereis {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
         int count=0;
         int rv=0;
        for(int i=1;i<=n;){
            count++;
            if (count%m!=0){
              rv=3*count+2;
                System.out.println(rv);
              i++;
            }


        }


    }



}
