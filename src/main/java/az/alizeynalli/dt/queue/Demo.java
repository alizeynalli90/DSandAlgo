package az.alizeynalli.dt.queue;

public class Demo {

    public static void main(String[] args) {
        System.out.println("+++Enqueue+++");
        Queue list = new Queue(5);
        list.enqueue(1);
        list.enqueue(2);
        list.enqueue(3);
        list.enqueue(4);
        list.enqueue(5);
        list.print();
        System.out.println("+++Dequeue+++");
        list.dequeue();
        list.print();
        System.out.println("+++rear/front+++");
        System.out.println(list.getRear());
        System.out.println(list.getFront());
    }
}
