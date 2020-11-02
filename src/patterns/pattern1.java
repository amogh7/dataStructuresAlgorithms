package patterns;

import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        while(row<=n){
            int stars=1;
            while(stars<=row){
                System.out.print("*\t");
                stars++;
            }
            System.out.println();
            row++;
        }

    }
}
