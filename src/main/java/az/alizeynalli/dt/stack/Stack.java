package az.alizeynalli.dt.stack;

public class Stack {

    private static final int max = 100;

    private int top;

    private final int[] list = new int[max];

    public boolean isEmpty() {
        return top == -1;
    }

    public Stack() {
        top = -1;
    }

    public boolean push(int value) {
        if (top > (max - 1)) {
            return false;
        } else {
            list[++top] = value;
            return true;
        }
    }

    public int pop() {
        if (top < 0) {
            return 0;
        } else {
            return list[top--];
        }
    }

    public int peek() {
        if (top < 0) {
            return 0;
        } else {
            return list[top];
        }
    }

    public void print() {
        for (int i = 0; i <= top; i++) {
            System.out.println(list[i]);
        }
    }

}
