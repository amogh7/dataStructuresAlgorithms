package bitmasking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int k=(n/2)+2;
        while(row<=n){
            int col=1;
            int c=1;
            while(col<=n){
                if(c>=k){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
                if(col<=n/2){
                    c++;
                }
                else{
                    c--;
                }
                col++;
            }
            System.out.println();
            if(row<=n/2){
                k--;
            }
            else{
                k++;
            }
            row++;

        }


    }

}
