package Heaps;

public class HeapClient {
    public static void main(String[] args) {
        Heaps heap=new Heaps();
        heap.insert(6);
        heap.insert(9);
        heap.insert(0);
        heap.insert(4);
        heap.insert(7);
        heap.insert(8);
        heap.display();
        System.out.println(heap.remove());
     heap.display();
        System.out.println(heap.remove());
        heap.display();
        System.out.println(heap.remove());
        heap.display();
        System.out.println(heap.remove());
        heap.display();
    }
}
