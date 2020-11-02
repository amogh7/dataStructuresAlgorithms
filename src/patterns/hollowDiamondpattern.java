package patterns;

import java.util.Scanner;

public class hollowDiamondpattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
      //  int row=1;
        int k=1;
        int p=n/2+2;
        while(k<=n) {
            int col = 1;
            int c = 1;
            while (c <= n + 2) {
                if (col >= p) {
                    System.out.print(" \t");

                } else {
                    System.out.print("*\t");
                }
                if (c < n / 2+2) {
                    col++;
                } else {
                    col--;
                }
                c++;
            }

            System.out.println();
            if (k <= n / 2) {
            //   row++;
                p--;
            } else {
                //row--;
                p++;
            }
            k++;
        }
    }
}
