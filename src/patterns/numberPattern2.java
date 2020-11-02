package patterns;

import java.util.Scanner;

public class numberPattern2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        while(row<=n){
            int numbers=1;
            int var=1;
            while(numbers<=2*n-1){
                if(var<=row){
                    System.out.print(var+"\t");
                }
                else{
                    System.out.print(" \t");
                }
                if(numbers<n){
                    var++;
                }
                else {
                    var--;
                }
                numbers++;

            }
            System.out.println();
            row++;
        }

    }
}
