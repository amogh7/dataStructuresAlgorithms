package patterns;

import java.util.Scanner;

public class patternhourglass {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int row =1;
        int k=1;
        while(row<=2*n-1){
            int side=1;
            int stars=1;
            while(stars<=2*n-1){
                if(side<=k){
                    System.out.print("*\t");
                }
                else {
                    System.out.print(" \t");
                }
                if(stars<n){
                    side++;
                }
                else{
                    side--;
                }
                stars++;
            }
            if(row<n){
                k++;
            }
            else{
                k--;
            }
            System.out.println();
            row++;
        }

    }
}
