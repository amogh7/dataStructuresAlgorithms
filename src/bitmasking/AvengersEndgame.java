package bitmasking;

import java.util.Scanner;

public class AvengersEndgame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       int[] arr={2,3,5};
      //  for(int i=0;i<n;i++){
          //  arr[i]=sc.nextInt();
        //}
        int c=0;
        while(c<n){
            int m=sc.nextInt();
            c++;
            int res=0;
            for(int i=1;i<(1<<arr.length);i++){
              int ans=getDivisors(arr,i);
              if((countSetBits(i) & 1)==1){
                  res=res+ m/ans;
              }
              else{
                  res= res- m/ans;
              }

            }
            System.out.println(res);

        }
    }
    public static int getDivisors(int[] arr,int i){
        int ans=1;
        int pos=0;
        while(i>0){
            if((i&1)==1){
                ans=ans*arr[pos];
            }
            pos++;
            i=(i>>1);


        }
        return ans;

    }
    public static int countSetBits(int i){
       int count=0;
        while(i>0){
            i=(i&(i-1));
            count++;
        }
        return count;
    }
}
