package patterns;

import java.util.Scanner;

public class pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        while (row <= n) {
            int stars = 1;
            while (stars <= row) {
                if (stars == 1 || stars == row) {
                    System.out.print(row+"\t");
                } else
                    System.out.print("0\t");
                stars++;
            }
            System.out.println();
            row++;
        }

    }
}
