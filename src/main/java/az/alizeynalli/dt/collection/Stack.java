package az.alizeynalli.dt.collection;

public class Stack {

    public static void main(String[] args) {
        java.util.Stack<Integer> orders = new java.util.Stack<Integer>();

        for (int i = 1; i < 10; i++) {
            orders.push(i);
        }

        System.out.println(orders);
        orders.pop();
        System.out.println(orders);
    }

}
