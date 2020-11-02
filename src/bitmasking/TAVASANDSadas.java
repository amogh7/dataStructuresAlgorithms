package bitmasking;

import java.util.Scanner;

public class TAVASANDSadas {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       String str=sc.nextLine();
        int ans=(1<<str.length())-2;
        int pos=0;
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)=='7'){
                ans=ans+(1<<pos);
            }
            pos++;

        }
        System.out.println(ans+1);



    }
}
