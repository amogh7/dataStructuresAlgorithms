package linkedList;

import java.util.Stack;

public class  LinkedList {
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
   Node mid=list.mid();
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
    Node rleft;
    public boolean isPallindrome(){
        rleft=head;
        return isPallindrome(head);
    }
    public boolean isPallindrome(Node right){
        if(right==null){
            return true;
        }
       boolean ans= isPallindrome(right.next);
        if(ans==false){
            return false;
        }
        else if(rleft.value!=right.value){
            return false;
        }
        else{
            rleft=rleft.next;
            return true;
        }

    }

    public void cycleDetection(){
        Node slow=head;
        Node fast=head;
        while(slow.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){

                break;
            }
        }
        if(fast==slow)
        removeCycle(fast,head);

        }
        public void removeCycle(Node fast,Node head){

            Node pt1=head;
            Node pt2=fast;

                while(pt2!=null&&pt1!=null){
                    pt1=pt1.next;
                    pt2=pt2.next;
                    if(pt1.next==pt2.next){
                         pt2.next=null;
                        return;
                    }
                }

        }
        public  void kreverse(int k){
            Stack<Node> stack=new Stack<>();
            int count=0;
            Node pt=null;
            Node nxt=head;
            while(nxt!=null){
                stack.push(nxt);
                nxt=nxt.next;
                count++;
                if(count==k){
                    while(!stack.isEmpty()){

                        if(pt==null) {
                            pt = stack.pop();
                            head=pt;
                            count--;
                        }
                        else{
                            pt.next=stack.pop();
                            pt=pt.next;
                            count--;
                        }
                    }
                }
            }
            tail=pt;
            tail.next=null;
        }
//    public void kreverse(int k){
//        Node prev = null;
//        Stack<Node> stack = new Stack<>();
//        Node temp= head;
//        while(temp!=null){
//            int cnt =1;
//            while(temp!=null && cnt <=k){
//                stack.push(temp);
//                temp =temp.next;
//                cnt=cnt+1;
//            }
//            while (!stack.isEmpty()){
//                if(prev == null){
//                    prev = stack.pop();
//                    head = prev;
//                }
//                else{
//                    prev.next=stack.pop();
//                    prev = prev.next;
//                }
//            }
//        }
//        prev.next=null;
//        tail = prev;
//    }

public void oddAfterEven(){
        Node oddHead=null;
        Node evenHead=null;
        Node oddTail=null;
        Node evenTail=null;
        Node node=head;
        while(node!=null){
            if(node.value%2==0){
                if(evenHead==null){
                    evenHead=node;
                    evenTail=node;

                }
                else{
                    evenTail.next=node;

                    evenTail=node;
                }
            }
            else{
                if(oddHead==null){
                    oddHead=node;
                    oddTail=node;
                }
                else{
                    oddTail.next=node;
                    oddTail=node;
                }
            }
            node=node.next;
        }
        if(oddHead!=null &&oddTail!=null) {
            oddTail.next = evenHead;
            this.head = oddHead;
        }
        if(evenHead!=null&&evenHead!=null) {
            this.tail = evenTail;
            this.tail.next = null;
        }
}
//public void evenAfterOdd(){
//        LinkedList odd=new LinkedList();
//        LinkedList even=new LinkedList();
//        while(this.size>0){
//           Node val=this.get(1);
//           this.deleteFirst();
//            if(val.value%2!=0) {
//                odd.insertLast(val.value);
//            }
//            else{
//                even.insertLast(val.value);
//            }
//            if(even.size>0&&odd.size>0){
//                this.head=odd.head;
//                odd.tail.next=even.head;
//                this.tail=even.tail;
//                this.size=odd.size+even.size; //check for why tail.next=null;
//            }
//            else if(odd.size>0){
//                this.head=odd.head;
//                this.tail=odd.tail;
//                this.size=odd.size;
//            }
//            else if(even.size>0){
//                this.head=even.head;
//                this.tail=even.tail;
//                this.size=even.size;
//            }
//        }
//}


    public void removeDuplicates(){//one more way is to make another Linked List
                                   // add to that linked list if values do not repeat
        Node temp=this.head;       // and update orignal lists head and tail;
        while(temp!=null){
            if(temp.next!=null &&temp.value==temp.next.value){
                temp.next=temp.next.next;
                this.size--;
            }
            temp=temp.next;
        }
    }
    public LinkedList addTwoLinkedList(LinkedList first, LinkedList second){
          LinkedList res=new LinkedList();
          int oc =AddHelper(first.head,first.size,second.head,second.size,res);
         if(oc>0){
             res.insertFirst(oc);
         }
         return res;

    }
    public int AddHelper(Node l1,int n1,Node l2,int n2,LinkedList list){
        if(l1==null&&l2==null){
            return 0;
        }
        int data =0;
        if(n1>n2){
           int oc= AddHelper(l1.next,n1-1,l2,n2,list);
            data =oc+l1.value;
        }
        else if(n2>n1){
            int oc =AddHelper(l1,n1,l2.next,n2-1,list);
             data =oc+l2.value;
        }
        else{
            int oc =AddHelper(l1.next,n1-1,l2.next,n2-1,list);
           data=oc+l1.value+l2.value;

        }
        int ans=data%10;
        list.insertFirst(ans);
        int c=data/10;
        return c;

    }
}
