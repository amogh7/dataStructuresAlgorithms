package stackandqueue;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class firstNonReapeatingInStream {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Queue<Character> q=new LinkedList();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            char ch=sc.next().charAt(0);
           if (!map.containsKey(ch)) {
               map.put(ch, 1);
               q.add(ch);
           }
           else {
               map.put(ch,map.get(ch)+1);
               q.add(ch);
           }
           while(!q.isEmpty()) {
               char fc=q.peek();
               if (map.get(fc) == 1) {
                   System.out.print(fc + " ");
                   break;
               } else {

                   q.remove();
               }
           }
           if(q.isEmpty()){
               System.out.print("-1"+" ");
           }



        }
    }
}
