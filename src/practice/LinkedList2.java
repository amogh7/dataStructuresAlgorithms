package practice;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class LinkedList2 {
    Node head;
    Node tail;
    int size=0;
    private class Node{
        int value;
        Node next;
        public Node(int value){
            this.value=value;
        }


    }
    public void addFirst(int val){

        Node node=new Node(val);
        node.next=head;
        head=node;

        if(tail==null){
            tail=node;
        }
        size++;

    }
    public void addLast(int val){
        Node node=new Node(val);
        if(size>=1) {
            tail.next = node;
        }
         if(size==0){
            head=node;
        }
        tail=node;
        node.next=null;
        size++;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+"=>");
            temp=temp.next;
        }
        System.out.println("End");

    }
    public int removeFirst(){
        if(size==0){
            System.out.println("khaali hai be");
            return -1;
        }
        int temp=head.value;
        head=head.next;
        if(head==null){
           tail=null;
        }
        size--;

        return temp;


    }
    public int removeLast(){
        if(size<=1){
            removeFirst();
        }
        Node temp=head;
       while(temp.next!=tail){
           temp = temp.next;
       }
       int ans=temp.next.value;
       temp.next=null;
       tail=temp;
       size--;
       return ans;
    }

    public Node  getNode(int val){
        if(size==0){
            System.out.println("khaali hai be");
            return null;
        }
        Node temp=head;
        for(int i=0;i<val;i++){
            temp=temp.next;
        }
        return temp;


    }
    public int removeAt(int val){
        if(size<=1){
            removeFirst();
        }
        if(val==size-1){
            removeLast();
        }

        Node prev= getNode(val-1);
        Node temp=prev.next;
        Node agla=prev.next.next;
        prev.next=agla;
        size--;
        return temp.value;

    }
    public void insertAt(int index,int val){
        if(size==0){
            addFirst(val);
        }
        if(size==index){
            addLast(val);
        }
        if(index>size){
            System.out.println("pagal");
            return;
        }
        Node node=new Node(val);
       Node prev= getNode(index-1);
       node.next=prev.next;
       prev.next=node;
       size++;

    }
    public  void reverse(){
        
    }



}
