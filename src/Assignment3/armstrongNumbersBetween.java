package Assignment3;

import java.util.Scanner;

public class armstrongNumbersBetween {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        for(int i=n;i<=m;i++){
            if(Armstrong(i)){
                System.out.println(i);
            }
        }

    }

    public static boolean Armstrong(int n){
        int rem=0;
        int ans=0;
        int temp=n;
        while(n!=0){
            rem=n%10;
            ans= ans+(int)Math.pow(rem,Digits(temp));
            n=n/10;
        }
        if(ans==temp){
            return true;
        }
        else{
            return false;
        }

    }
    public static int Digits(int n){
        int count=0;
        while(n!=0){
            n=n/10;
            count++;
        }
        return count;
    }

}
