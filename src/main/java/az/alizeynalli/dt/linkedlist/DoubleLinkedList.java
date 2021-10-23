package az.alizeynalli.dt.linkedlist;

public class DoubleLinkedList {
    DoubleNode head;

    public DoubleLinkedList(DoubleNode head) {
        this.head = head;
    }

    public DoubleNode getHead() {
        return head;
    }

    public void setHead(DoubleNode head) {
        this.head = head;
    }

    public void traverse() {

        DoubleNode temp = head;
        DoubleNode last = new DoubleNode();
        System.out.println("+++traverse forward+++");
        while (temp != null) {
            System.out.println(temp.getData());
            last.setNext(temp);
            temp = temp.getNext();
        }
    }

    public void push(DoubleNode node) {
        node.setPrevious(null);
        node.setNext(head);
        head = node;
    }

    public void append(DoubleNode node) {
        DoubleNode temp = head;

        node.setNext(null);
        if (head == null) {
            head = node;
            node.setPrevious(null);
            return;
        }

        while (temp.getNext() != null) {
            temp = temp.getNext();
        }
        temp.setNext(node);
        node.setPrevious(temp);
    }

}
