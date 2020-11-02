package stackandqueue;

public class stackclient {
    public static void main(String[] args) {//Exception is different from error error cannot be managed easily stack trace is used for exception and also aexception class is there
        Stack stack=new Stack();
        stack.push(1);
        stack.push(2);
         stack.push(3);

        for (int i = 0; i <=2 ; i++) {
            System.out.println(stack.pop());
        }
    }
}
