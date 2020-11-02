package practice;

public class client {
    public static void main(String[] args) {
        LinkedList2 list=new LinkedList2();
        list.addLast(3);
        list.addFirst(3);
        list.addFirst(4);
        list.addFirst(5);
        list.display();

       list.addLast(4);
     list.display();
            System.out.println(list.removeLast());
            list.display();
    }
}
