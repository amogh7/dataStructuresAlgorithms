package stackandqueue;

public class Stack {
    private int data[]; //interenally stack uses vector by extending
    private int top;

    public Stack() {
        this.data=new int[10];
        this.top=-1;
    }
    public void push(int element){
       if(isFull()){
           return;
       }
       data[++top]=element;
    }
    public boolean isFull(){
        return top==data.length-1;
    }
   public boolean isEmpty(){
        return top==-1;
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("khaali hai be");
            return -1;
        }
        return data[top--];
    }
}
