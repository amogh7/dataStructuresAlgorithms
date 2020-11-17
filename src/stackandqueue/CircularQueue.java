package stackandqueue;

public class CircularQueue {
    protected int[] data;
    protected int rear;
    protected int front;
    protected int size;

    public CircularQueue() {
        this.data=new int[10];
        this.rear=0;
        this.front=0;
        this.size=0;
    }
    public boolean isFull(){
        return this.size==data.length;
    }
    public  void enqueue(int element){
        if(isFull()){
            return;
        }
        data[rear++]=element;
       rear=rear%data.length;
       size++;
    }
    public boolean isEmpty(){
        return this.size==0;
    }
    public int deque(){
        if(isEmpty()){
            return -1;
        }
        front =front%data.length;


        size--;
        return data[front++];

    }
    public void display(){
        for(int i=0;i<data.length-1;i++){
            int indx=(front+i)%data.length;
            System.out.println(data[indx]+" ");
        }
    }
}
