package stackandqueue;
import java.util.Stack;
import java.util.ArrayList;
import java.util.Scanner;

public class PlayingWithCards {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int q=sc.nextInt();
        ArrayList<Stack<Integer>>  A=new ArrayList<>();
        ArrayList<Stack<Integer>>  B=new ArrayList<>();
        for(int i=0;i<=q;i++){
            A.add(new Stack<Integer>());
        }
        for(int i=0;i<=q;i++){
            B.add(new Stack<Integer>());
        }

        for(int i=0;i<n;i++){
            int it=sc.nextInt();
            A.get(0).push(it);
        }
        for(int i=1;i<=q;i++){
            Stack<Integer> azero=A.get(i-1);
            int ith= ithPrime(i);
            while(!azero.isEmpty()){

               int item=azero.pop();
                if(item%ith==0){
                    B.get(i).push(item);
                }
                else{
                    A.get(i).push(item);
                }
            }
        }
        for(int i=1;i<=q;i++){
            while(!B.get(i).isEmpty()){
                System.out.print(B.get(i).pop()+" ");
            }
        }

            while(!A.get(q).isEmpty()){
                System.out.print(A.get(q).pop()+" ");

        }

    }

    private static int ithPrime(int i) {
        int counter=0;
        int j=2;
        while(true){
            if(isPrime(j)){
                counter++;
            }
            if(counter==i){
                return j;
            }
            j++;
        }

    }

    private static boolean isPrime(int j) {
        for(int i=2;i*i<j;i++){
            if(j%i==0){
                return false;
            }
        }
        return true;
    }

}
