package practice;

public class client {
    public static void main(String[] args) {
        LinkedList2 list=new LinkedList2();
        list.addLast(1);

       // list.addFirst(4);
        //list.addFirst(5);
         list.addLast(3);
        list.addLast(2);
        list.addLast(4);
        list.addLast(5);
        //  list.display();
    list.display();
           // System.out.println(list.removeLast());
//            list.display();
//            list.reverse();
//            list.display();
            LinkedList2 s=list.merge(list);
                  s.display();



    }
}
