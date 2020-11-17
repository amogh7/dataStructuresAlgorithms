package stackandqueue;

public class optimizedQueue {
    private int[] data;
    private int rear;
    private int front;

    public optimizedQueue(){

        this.data = new int[10];
        rear = 0;
        front =0;

    }

    private boolean isFull(){
        return rear == data.length;
    }

    public void enqueue(int element){

        if(isFull()){
            return;
        }

        data[rear++] = element;
    }

    public boolean isEmpty(){
        return front == 0;
    }

    public int deque(){//space is wasted in this so circular queue is made
// 0(n)
        if(isEmpty()){
            return -1;
        }


        return data[front++];

    }

}
