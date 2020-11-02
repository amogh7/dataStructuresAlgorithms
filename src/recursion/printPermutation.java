package recursion;

import java.util.Scanner;

public class printPermutation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        permutation("",s);

    }
    public static void permutation(String processed, String unprocessed){
        if(unprocessed.length()==0){
            System.out.print(processed+" ");
            return ;
        }
        char cc=unprocessed.charAt(0);
        unprocessed=unprocessed.substring(1);
        for(int i=0;i<=processed.length();i++){
            String first=processed.substring(0,i);
            String second=processed.substring(i);
            permutation(first+cc+second,unprocessed);
        }
    }
}

