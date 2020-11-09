package Assignment3;

import java.util.Scanner;

public class ith_prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();


        int counter=0;
        int i=2;
        while(true){
            if(isPrime(i)){
                System.out.println(i);
                counter++;
            }
            if(counter==n){

                break;
            }
            i++;
        }

    }

    private static boolean isPrime(int i) {

        for(int j=2;j*j<=i;j++){
            if(i%j==0){
                return false;
            }
        }
        return true;
    }
}
