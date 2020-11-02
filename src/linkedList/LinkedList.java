package linkedList;

public class LinkedList {
    Node head;
    Node tail;
    int size=0;
    private  class Node{
        int value;
        Node next;
        public Node(int value){
            this.value=value;
        }


    }
    public void insertFirst(int element){
        Node node=new Node(element);
        node.next=head;
        head=node;
            if(tail==null){
                tail=node;
            }
            size++;

    }
    public void insertLast(int element){
        if(size==0){
            insertFirst(element);
            return;
        }
        Node node=new Node(element);
            tail.next=node;
            tail=node;
            size++;


    }
    public void Display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+"-> ");
            temp=temp.next;
        }
        System.out.println("End");

    }
    public int deleteFirst(){
        if(size==0){
            System.out.println("List is Empty");
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
    public int deleteLast(){
        if(size<2){
           return deleteFirst();

        }
        Node temp=head;
        int del=tail.value;
        while(temp.next!=tail){
            temp=temp.next;
        }
        temp.next=null;
        tail=temp;
        size--;

        return del;

    }
    public Node get(int index){
        if(size==0){
            System.out.println("list is empty");
            return null;
        }
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp;


    }
    public void insertAt(int index,int value){
        if(index==0){
            insertFirst(value);
            return;
        }
        if(index==size){
            insertLast(value);
            return;
        }
        Node prev=get(index-1);
        Node node=new Node(value);
        node.next=prev.next;
        prev.next=node;
        size++;

    }
    public int deleteAt(int index){
        if(index==0){
           return deleteFirst();

        }
        if(index==size-1){
            return deleteLast();
        }

        Node prev=get(index-1);
        int temp=prev.next.value;
        prev.next=prev.next.next;
        size--;
        return temp;
    }
    public void reverse(){
        reverse(head);
    }
    private void reverse(Node node){
        if(node==tail){
           head=tail;
            return;
        }
        reverse(node.next);
        tail.next=node;
        node.next=null;
        tail=node;


    }
    public int kthfromLast(int k){
        Node fast=head;
        Node slow =head;
        for(int i=0;i<k;i++){
            fast=fast.next;
        }
        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        return slow.value;

    }
    public Node mid(){
        Node fast=head;
        Node slow=head;
        while(fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public LinkedList merger(LinkedList list1,LinkedList list2 ){
        Node f=list1.head;
        Node s=list2.head;
        LinkedList list3=new LinkedList();
        while(f!=null&&s!=null) {
            if (f.value < s.value) {
                list3.insertLast(f.value);
                f = f.next;
            } else {
                list3.insertLast(s.value);
                s = s.next;
            }
        }
            while(f!=null){
                list3.insertLast(f.value);
                f=f.next;
            }
            while(s!=null){
                list3.insertLast(s.value);
                s=s.next;
            }
            return list3;



    }
    public LinkedList mergeSort(LinkedList list){
   if(list.size==1){
       return list;
   }
   LinkedList first=new LinkedList();
   LinkedList second=new LinkedList();
   Node mid=mid();
    first.head=list.head;
    first.tail=mid;
    first.size=(list.size+1)/2;
        second.head=mid.next;
        second.tail=list.tail;
        second.size=list.size/2;
        mid.next=null;
       first= mergeSort(first);
        second= mergeSort(second);
        return merger(first,second);


    }



}
