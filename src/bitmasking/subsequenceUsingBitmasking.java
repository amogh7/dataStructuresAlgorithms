package bitmasking;

import java.util.Scanner;

public class subsequenceUsingBitmasking {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        for(int i=0;i<(1<<s.length());i++){
//                for(int j=s.length()-1;j>=0;j--){ first method
//                    int mask=1<<j;
//                    if((i&mask)!=0){
//                        System.out.print(s.charAt(s.length()-j-1));
//                    }
//                }
//                System.out.println();
            printSubs( s, i);
        }

    }
    public static void printSubs(String str,int i){
        int pos=0;//for opposite positioning pos=str.length-1;
        while(i>0){
            if((i&1)==1){
                    System.out.print(str.charAt(pos));
            }
            i>>=1;
            pos++;//for opposite positioning pos--;
        }
        System.out.println();
    }
}
