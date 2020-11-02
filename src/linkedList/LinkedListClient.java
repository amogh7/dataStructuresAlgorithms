package linkedList;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class LinkedListClient {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedList list=new LinkedList();

        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(2);
        list.insertLast(4);

//        list.Display();
//        list.insertAt(2,4);
//        list.Display();
//        System.out.println(list.deleteLast());
//        System.out.println(list.deleteFirst());
//        System.out.println(list.deleteAt(3));
//
//        list.Display();
//        list.reverse();
        LinkedList list2=new LinkedList();

        list2.insertLast(8);
        list2.insertLast(9);
        list2.insertLast(10);
        list2.insertLast(11);
        list2.insertLast(12);
          list.Display();
        System.out.println(list.kthfromLast(2));
        LinkedList list3=new LinkedList();

       list3  =list.merger(list,list2);
       list3.Display();





    }
}
