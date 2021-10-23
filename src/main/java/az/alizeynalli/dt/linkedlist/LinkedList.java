package az.alizeynalli.dt.linkedlist;

/*
Pros
Dynamic size
Ease of insertion/deletion
Cons
no random access
extra memory for pointer
not cache friendly
 */
public class LinkedList {
    private Node head;

    public LinkedList(Node head) {
        this.head = head;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public void traverse() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }

    public void push(Node node) {
        node.setNext(head);
        head = node;
    }

    public void append(Node node) {
        if (head == null) {
            head = node;
            return;
        }

        Node last = head;
        while (last.getNext() != null) {
            last = last.getNext();
        }
        last.setNext(node);
        return;
    }

    public void deleteFirstOccurence(Node node) {
        Node temp = head;
        Node previous = null;

        if (temp != null && temp.getData() == node.getData()) {
            head = head.getNext();
            return;
        }

        while (temp != null && temp.getData() != node.getData()) {
            previous = temp;
            temp = temp.getNext();
        }

        if (temp == null) {
            return;
        }

        previous.setNext(temp.getNext());
        return;
    }

}
