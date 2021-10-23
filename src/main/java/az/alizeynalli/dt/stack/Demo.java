package az.alizeynalli.dt.stack;

public class Demo {

    public static void main(String[] args) {
        Stack stack = new Stack();

        System.out.println("+++push+++");
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.print();
        System.out.println("+++pop+++");
        stack.pop();
        stack.print();
        System.out.println("+++peek+++");
        System.out.println(stack.peek());
        stack.push(6);
    }
}
