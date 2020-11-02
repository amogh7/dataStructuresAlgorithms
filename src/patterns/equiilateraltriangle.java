package patterns;

import java.util.Scanner;

public class equiilateraltriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int nst=1;//row=2
       int nsp=n/2;//nsp=4 3
       while(row<=n){//1
           int csp=1;//csp=1
           while(csp<=nsp){
               System.out.print(" ");
               csp++;
           }
           int cst=1;//cst=1
           while(cst<=nst){//nst=1 3
               System.out.print("*");
               cst++;
           }
           System.out.println();
           if(row<=n/2){
               nst=nst+2;
               nsp--;

           }
           else{
               nst=nst-2;
               nsp=nsp+1;
           }
           row++;

       }
    }
}
