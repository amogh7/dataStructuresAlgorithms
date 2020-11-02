package Assignment3;

import java.util.Scanner;

public class lognX {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        int ans= (int) (Math.log(x)/Math.log(n));
        System.out.println(ans);
    }

}
