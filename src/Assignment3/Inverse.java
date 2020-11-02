package Assignment3;

import java.util.Scanner;

public class Inverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int rem=0;
        int ans=0;
        int count=0;
        while(n!=0){
            count++;
            rem=n%10;
            ans= (int) (ans+count*Math.pow(10,rem-1));
            n=n/10;
        }
          System.out.print(ans);
    }
}
