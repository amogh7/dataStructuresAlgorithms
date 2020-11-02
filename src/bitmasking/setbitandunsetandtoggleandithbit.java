package bitmasking;

import java.util.Scanner;

public class setbitandunsetandtoggleandithbit {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        int j = sc.nextInt();
        int k = sc.nextInt();
        int m = sc.nextInt();
        int imask = (1 << i);
        int jmask = (1 << j);
        int kmask = (1 << k);
        int mmask = (1 << m);
        System.out.println(n|imask);
        System.out.println(n&(~jmask));
        System.out.println(n^kmask);
        System.out.println((n&mmask)==0?0:1);

    }
}
