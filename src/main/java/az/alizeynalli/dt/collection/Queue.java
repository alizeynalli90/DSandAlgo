package az.alizeynalli.dt.collection;

public class Queue {

    public static void main(String[] args) {
        java.util.Queue<Integer> line = new java.util.LinkedList<Integer>();

        for (int i = 1; i < 10; i++) {
            line.add(i);
        }
        System.out.println(line);
        line.remove();
        System.out.println(line);

    }

}
