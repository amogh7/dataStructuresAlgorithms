package patterns;

import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int row=1;
            int val=1;
            while(row<=n){
                int stars=1;
                while(stars<=row){
                    System.out.print(val+"\t");
                    stars++;
                    val++;
                }
                System.out.println();
                row++;
            }
        }
    }

