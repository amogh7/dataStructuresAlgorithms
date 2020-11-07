package practice;

import jdk.swing.interop.SwingInterOpUtils;

public class StackUsingArray {
  protected int data[];
    int top;
    int size;
     static int DEFAULT_CAPACITY=10;
    public StackUsingArray(){
             this(DEFAULT_CAPACITY);
    }
    public StackUsingArray(int capacity){
         data=new int[capacity];
         top=-1;
         size=0;


    }



    public void push(int val){
        if (isFull()){
           return;
        }
        this.data[++top]=val;
        size++;

    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Khaali hai be");
            return -1;
        }
        size--;
        return this.data[top--];
    }
    public boolean isEmpty(){
        return this.top==-1;
    }
    public boolean isFull(){
        return this.top==data.length-1;
    }
    public void Display(){
        for(int i=top;i>=0;i--){
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }
    public  void reverseStack(StackUsingArray stack){
        StackUsingArray helper=new StackUsingArray();
        while(!stack.isEmpty()){
            helper.push(stack.pop());
        }
        reverseStack(stack,helper);
    }
    public void reverseStack(StackUsingArray stack,StackUsingArray helper){
        if(helper.isEmpty()){
            return;
        }
       int item= helper.pop();
        reverseStack(stack,helper);
        stack.push(item);

    }



}
