package questions;

import java.util.Scanner;

public class boston {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         int div=2;
         int prime=0;
         int sum=0;
         int temp=n;
	 while(div*div<=temp){
        while(temp%div==0){
            temp=temp/div;
            prime=prime+DigitSum(temp);
        }
           div++;
    }
	 if(temp!=1){

         prime=prime+DigitSum(temp);
    }
	 sum=sum+DigitSum(n);
	 if(sum==prime){
         System.out.println(1);
     }
	 else {
         System.out.println(0);
     }



}
public static int DigitSum(int n){
        int sum=0;
        int rem=0;
        while(n!=0){
           rem=n%10;
           sum=sum+rem;
           n=n/10;
        }
        return sum;

}
}
