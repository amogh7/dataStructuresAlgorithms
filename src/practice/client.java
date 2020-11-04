package practice;

public class client {
    public static void main(String[] args) {
    // StackUsingArray stack=new StackUsingArray();
        DynamicStackArray stack=new DynamicStackArray();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.Display();
        stack.reverseStack(stack);
        stack.Display();





    }
}
