package bitmasking;

import java.util.Scanner;

public class Uniquenuber3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] countArray=new int[32];
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
            int no = arr[i];
            int pos = 0;
            while (no > 0) {
                if ((no & 1) == 1) {
                    countArray[pos]++;
                }
                no = no >> 1;
                pos++;
            }
        }
            for(int i=0;i<32;i++){
                countArray[i]%=3;
            }
            int ans=0;
            int mult=1;
            for(int i=0;i<32;i++){

                    ans=ans+countArray[i]*mult;
                    mult=mult*2;

            }
            System.out.println(ans);

        }
    }

