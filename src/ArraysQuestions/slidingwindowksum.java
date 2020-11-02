package ArraysQuestions;

import java.util.Scanner;

public class slidingwindowksum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        int k=sc.nextInt();
        int sum=0;
        int maxsum=0;
        for(int i=0;i<k;i++){
           sum=sum+arr[i];
        }
        maxsum=sum;
        for(int i=k;i<n;i++ ){
            sum=sum+arr[i]-arr[i-k];
        }
        if(sum>maxsum){
            maxsum=sum;
        }
        System.out.println(maxsum);

    }
}
