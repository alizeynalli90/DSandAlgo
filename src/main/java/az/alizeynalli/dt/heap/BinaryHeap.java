package az.alizeynalli.dt.heap;

public class BinaryHeap {
    private static final int d = 2;
    private final int[] heap;
    private int size;

    public BinaryHeap(int capacity) {
        size = 0;
        heap = new int[capacity + 1];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == heap.length;
    }

    public int getParent(int i) {
        return (i - 1) / d;
    }

    public int getkthChild(int i, int k) {
        return d * i + k;
    }

    public void insert(int x) {
        if (isFull()) {
            return;
        }
        heap[size++] = x;
        heapifyUp(size - 1);
    }

    public void heapifyUp(int i) {
        int temp = heap[i];
        while (i > 0 && temp > heap[getParent(i)]) {
            heap[i] = heap[getParent(i)];
            i = getParent(i);
        }
        heap[i] = temp;
    }

    public int findMax() {
        if (isEmpty()) {
            return -1;
        }
        return heap[0];
    }

    public void printHeap() {
        System.out.print("n =  ");
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + " ");
            System.out.println();
        }
    }


}
