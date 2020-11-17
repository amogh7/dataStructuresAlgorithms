package practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class test {
    public static void main(String[] args)   throws FileNotFoundException {
        File file = new File("input");
        Scanner sc=new Scanner(file);


        int sum=0;
        int count=0;


        ArrayList<Integer> list=new ArrayList<>();
       String line;
        int n = sc.nextInt();
          sc.nextLine();

       while (!(line = sc.nextLine()).isEmpty()) {
           int value=Integer.parseInt(line);
              list.add(value);
             count++;
        }
//
//                String input=sc.nextLine();
//                if(input.length()==0){
//                    break;
//                }
//
//
        Collections.sort(list);
          for(int i=0;i<list.size()-1;i++){
                if(list.get(i)==list.get(i+1)){
                    sum=sum+list.get(i)+1;
                    continue;
                }
                    sum=sum+list.get(i);
            }
            if(count==n){
                System.out.println(sum+list.get(list.size()-1));
            }
            else if(count>n){
                System.out.println("wrong");
            }
        }
        }




