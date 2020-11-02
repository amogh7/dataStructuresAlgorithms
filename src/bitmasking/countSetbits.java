package bitmasking;

import java.util.Scanner;

public class countSetbits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int counter=0;

//        while(n>0){
//            int mask=~(n&(-n));
//            n=n&mask;
//            counter=counter+1;
//        }
//    System.out.println(counter);
//         while(n>0){//kernighansAlgo
//             int mask=n&(-n);
//             n=n-mask;
//             counter++;
//         }
        //System.out.println(counter);
//           while(n>0){
//           n=(n&(n-1));
//             counter++;
//         }
//        System.out.println(counter);
        int mask=1;
        int i=1;
        while(i<=32){
            if((n&mask)>0){
                counter++;

            }
            mask=(mask<<1);
             i++;
        }
        System.out.println(counter);

    }
}
