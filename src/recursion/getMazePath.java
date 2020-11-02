package recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class getMazePath {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rsize=sc.nextInt();
        int csize=sc.nextInt();
        System.out.println(getMaze(0,0,rsize-1,csize-1));
    }
    public static ArrayList<String> getMaze(int sr,int sc,int er,int ec){
        if(sr==er && sc==ec){
            ArrayList<String> br=new ArrayList<>();
            br.add("");
            return br;
        }
        if(sr>er||sc>ec){
            ArrayList<String> br=new ArrayList<>();
            return br;

        }
        ArrayList<String> mr=new ArrayList<>();
        ArrayList<String> rv=getMaze(sr+1,sc,er,ec);

        for(String rvs:rv){
            mr.add(rvs+"V");
        }
        ArrayList<String> rh=getMaze(sr,sc+1,er,ec);
        for(String rhs:rh){
            mr.add(rhs+"H");
        }
        return mr;

    }
}
