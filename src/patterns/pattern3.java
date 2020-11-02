package patterns;

import java.util.Scanner;

public class pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        n=n/2+1;
        int row = 1;
        int k = 1;
        while (row <= 2 * n - 1) {
            int space = 1;
            while (space <= n - k) {

                System.out.print(" ");
                space++;
            }
            int stars = 1;
            while (stars <= 2 * k - 1) {//st=1,//r=2,k=2

                System.out.print("*");
                stars++;

            }
            if (row < n) {
                k++;

            } else {
                k--;
            }
            System.out.println();
            row++;
        }
    }
}
