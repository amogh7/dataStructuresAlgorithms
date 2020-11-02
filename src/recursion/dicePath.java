package recursion;

import java.util.Scanner;

public class dicePath {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        dicePath("",target);


    }
    public static void dicePath(String processed,int target){
        if(target==0){
            System.out.println(processed);
            return;
        }
        for(int i=1;i<=6&&i<=target;i++){
            dicePath(processed+i,target-i);
        }

    }
}
