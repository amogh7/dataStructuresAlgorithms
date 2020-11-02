package patterns;

import java.util.Arrays;
import java.util.Scanner;

public class patternPascals {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int row=1;
    while(row<=n){

        int stars=1;
        int c=1;
        while(stars<=row){

            System.out.print(c+"\t");
            c=c*(row-stars)/stars;
            stars++;
        }
        System.out.println();
        row++;
    }

}
}
