package recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class getPermutation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        System.out.print( permutaionget(s));

    }
    public static ArrayList<String> permutaionget(String s){
        if(s.length()==0){
            ArrayList<String> br=new ArrayList<>();
            br.add("");
            return br;
        }
        char cc=s.charAt(0);
        String ros=s.substring(1);
        ArrayList<String> rec=permutaionget(ros);
        ArrayList<String> result=new ArrayList<>();
        for(String val:rec){
            for(int i=0;i<=val.length();i++){
                result.add(val.substring(0,i)+cc+val.substring(i));
            }
        }
        return result;

    }
}
