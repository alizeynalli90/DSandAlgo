package az.alizeynalli.dt.linkedlist;

public class DoubleNode {
    private int data;
    private DoubleNode next;
    private DoubleNode previous;

    public DoubleNode() {
    }

    public DoubleNode(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public DoubleNode getNext() {
        return next;
    }

    public void setNext(DoubleNode next) {
        this.next = next;
    }

    public DoubleNode getPrevious() {
        return previous;
    }

    public void setPrevious(DoubleNode previous) {
        this.previous = previous;
    }
}
