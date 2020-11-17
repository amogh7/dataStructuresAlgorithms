package practice;

public class myQueue {
    int rear=0;
    int front=0;
    int[] data=new int[10];
    int size=0;
    public void enqeue(int val){
        if(isFull()){
            return;
        }

        rear=rear%data.length;
        data[rear++]=val;
        size++;

    }
    public boolean isFull(){
        return this.size==data.length;
    }
    public boolean isEmpty(){
        return this.size==0;
    }

    public int deque(){
        if(isEmpty()){
            System.out.println("khaali hai bey");
            return -1;
        }


        front=front%data.length;

                size--;

        return data[front++];
    }
    public void display(){
        for(int i=0;i<size;i++){
            System.out.println(data[(front+i)%data.length]+" ");
        }
    }

}
