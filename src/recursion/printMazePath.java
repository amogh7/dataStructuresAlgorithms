package recursion;

import java.util.Scanner;

public class printMazePath {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rsize=sc.nextInt();
        int csize=sc.nextInt();
        PrintMaze(0,rsize-1,0,csize-1,"");

    }
    public static void PrintMaze(int sr,int er,int sc,int ec,String ans){
        if(sr==er&&sc==ec){
            System.out.println(ans);
            return;
        }
        if(sr>er||sc>ec){
            return;
        }
        PrintMaze(sr,er,sc+1,ec,ans+"H");
        PrintMaze(sr+1,er,sc,ec,ans+"V");
    }
}
