package practice;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.HashMap;
import java.util.HashSet;
//import java.util.LinkedList;
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
        if(val==0){
           return removeFirst();
        }
        if(val==size-1){
             return removeLast();
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
            return;
        }
        if(size==index){
            addLast(val);
            return;
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
        reverse(head);
    }
    private void reverse(Node node){
        if(node==tail){
            head=tail;
            return;
        }
        reverse(node.next);
        tail.next=node;
        tail=node;
        node.next=null;
    }
    public void intersection(Node n1,Node n2){

        Node temp1=n1;
        Node temp2=n2;
        int count1=1;
        int count2=1;

        while(temp1!=null){
            temp1=temp1.next;
            count1++;
        }
        while(temp2!=null){
            temp2=temp2.next;
            count2++;

        }
        int k=Math.abs(count1-count2);
        if(count1>count2) {
            for (int i = 0; i < k; i++) {
                n1 = n1.next;
            }
        }
            else{
                for(int j=0;j<k;j++){
                    n2=n2.next;
                }

            }
            while(n1!=n2){
                n1=n1.next;
                n2=n2.next;
            }
        System.out.println(n1.value);




    }

    public Node mid(){
        Node slow=head;
        Node fast=head;
        while(fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;

    }
    public LinkedList2 merger(LinkedList2 list2){
        LinkedList2 list=new LinkedList2();
        Node f=this.head;
        Node s=list2.head;
        while(f!=null&s!=null){
            if(f.value<s.value){
                list.addLast(f.value);
                f=f.next;
            }
            else{
                list.addLast(s.value);
                s=s.next;
            }
        }
        while(f!=null){
            list.addLast(f.value);
            f=f.next;
        }
        while(s!=null){
            list.addLast(s.value);
            s=s.next;
        }
        return list;


    }




}
