package Hashmap;

import java.sql.SQLOutput;
import java.util.HashMap;

public class client2 {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        System.out.println(occurence("helloooooo"));

    }
    public static  HashMap<Character,Integer> occurence(String str){
        HashMap<Character,Integer> map=new HashMap<>();
       for(int i=0;i<str.length();i++) {
           if(map.containsKey(str.charAt(i))){
               int count= map.get(str.charAt(i));
               map.put(str.charAt(i),count+1);
           }
           else {
               map.put(str.charAt(i), 1);
           }
       }
       return map;
    }
}
