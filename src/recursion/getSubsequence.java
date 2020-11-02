package recursion;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class getSubsequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(getS(s));

    }
    public static ArrayList<String> getS(String s){
        if(s.length()==0){
            ArrayList<String> br=new ArrayList<>();
            br.add("");
            return br;
        }
        char c=s.charAt(0);
        String ros=s.substring(1);
        ArrayList<String> recresult=getS(ros);
        ArrayList<String> result=new ArrayList<>();
        for(int i=0;i<recresult.size();i++){
            result.add(recresult.get(i));
            result.add(c+recresult.get(i));


        }
        return result;
    }
}
