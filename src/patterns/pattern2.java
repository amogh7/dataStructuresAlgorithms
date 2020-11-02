package patterns;

import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n =sc.nextInt();
    int row =1;
    while(row<=n){
        int space=1;
        while(space<=n-row){
            System.out.print(" \t");
            space++;

        }
        int stars=1;
        int k=row;
        while(stars<=2*row-1){

            if(stars<row){
                System.out.print(k+"\t");
                k++;

            }
            else {
                System.out.print(k+"\t");
                k--;

            }
            stars++;
        }
        System.out.println();
        row++;
    }
    }
}
