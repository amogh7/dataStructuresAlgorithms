package recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class getdicePath {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        System.out.println(getDicepath(0,target));

    }
    public static ArrayList<String> getDicepath(int start,int target){
        if(start==target){
            ArrayList<String> br=new ArrayList<>();
            br.add("");
            return br;
        }
        if(start>target){
            ArrayList<String> br=new ArrayList<>();
            return br;
        }
        ArrayList<String> mr=new ArrayList<>();
        for(int i=1;i<=6;i++){
            ArrayList<String> rr= getDicepath(start+i,target);


            for(String val:rr){
                mr.add(val+i);

            }

        }
        return mr;

    }
}
