package patterns;

import java.util.Scanner;

public class numberpattern {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int k=1;
        while(row<=2*n-1){

            int space=1;
            while(space<=n-k){
                System.out.print(" ");
                space++;
            }
            int numbers=1;
            int num=k-1;

            while(numbers<=2*k-1){

                  if(numbers<=k){
                      num++;
                      System.out.print(num);
                  }
                  else {
                      num--;
                      System.out.print(num);
                  }
                numbers++;
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
