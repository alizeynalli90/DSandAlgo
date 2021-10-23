package az.alizeynalli.dt.queue;

public class Queue {

    private final int capacity;
    private int rear;
    private int front;
    private int size;
    private final int[] list;

    public Queue(int capacity) {
        this.capacity = capacity;
        front = 0;
        rear = capacity - 1;
        size = 0;
        list = new int[capacity];
    }

    public boolean isFull() {
        return size == capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getRear() {
        return isEmpty() ? 0 : rear;
    }

    public int getFront() {
        return isEmpty() ? 0 : front;
    }

    // Method to add an item to the queue.
    // It changes rear and size
    public void enqueue(int item) {
        if (isFull()) {
            return;
        }
        rear = (rear + 1)
                % capacity;
        list[rear] = item;
        size = size + 1;
        System.out.println(item
                + " enqueued to queue");
    }

    // Method to remove an item from queue.
    // It changes front and size
    public int dequeue() {
        if (isEmpty()) {
            return Integer.MIN_VALUE;
        }

        int item = list[front];
        front = (front + 1)
                % capacity;
        size = size - 1;
        return item;
    }

    public void print() {
        for (int elem : list
        ) {
            System.out.println(elem);
        }
    }
}
