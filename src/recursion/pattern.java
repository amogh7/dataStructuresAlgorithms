package recursion;

import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        pattern(n,0);
    }
    public static void pattern(int row,int col){
        if(row==0){
            return ;
        }
        if(row==col){
            System.out.println();
            pattern(row-1,0);
            return;
        }


        System.out.print("*"+" ");
        pattern(row,col+1);
    }
}
