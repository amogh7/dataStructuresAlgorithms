package stackandqueue;

public class Queue {// A more optimized queue can be by taking a front pointer also and it can be further optimized by making it circular queue
    private int data[];
    private int rear;

    public Queue(){
        this.data=new int[10];
        rear=1;
    }
    public boolean isFull(){
        return rear==this.data.length-1;
    }
    public void enqueue(int element){
        if(isFull()){
            return;
        }
         data[++rear]=element;
    }
    public boolean isEmpty(){
        return rear==-1;
    }
    public int  deque() {
        if (isEmpty()) {
            return -1;
        }
        int temp = data[0];
        for (int i = 1; i <= rear; i++) {
            data[i - 1] = data[i];
        }
        rear--;
        return temp;
    }

}
