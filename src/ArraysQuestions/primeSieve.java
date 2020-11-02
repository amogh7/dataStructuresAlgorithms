package ArraysQuestions;

import java.util.Scanner;

public class primeSieve {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int  n=sc.nextInt();
//        int  [] p=new int[n+1]; //more optimized way
//                for(int i=3;i<p.length;i=i+2){
//                      p[i]=1; //this indicates all even numbers are marked 0 that is not prime so the loop is started from 3 as even numbers are marked 0;
//        }
//          for(int i=3 ;i<p.length;i=i+2){
//            if(p[i]==1){
//            for(int j=i*i;j<p.length;j=j+i){
//                p[j]=0;
//            }
//            }
//        }
//        p[2]=1;
//        p[1]=0;
//        p[0]=0;
  //second way
        boolean[] prime=new boolean[n+1];
        prime[0]=prime[1]=true;
        for(int i=2;i*i<prime.length;i++){
            if(!prime[i]){
                for(int j=2;j*i<prime.length;j++){
                    prime[i*j]=true;
                }
            }
        }
        for(int i=0;i<=n;i++){
            if(prime[i]==false){
                System.out.print(i+" ");
            }
        }
    }





}
