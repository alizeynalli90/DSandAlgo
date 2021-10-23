package az.alizeynalli.dt.linkedlist;

public class Demo {
    public static void main(String[] args) {
        System.out.println("+++LinkedList+++");
        LinkedList list = new LinkedList(new Node(1));
        Node second = new Node(2);
        Node third = new Node(3);

        list.getHead().setNext(second);
        second.setNext(third);
        System.out.println("+++traverse: O(n)+++");
        list.traverse();

        System.out.println("+++push: O(1)+++");
        list.push(new Node(4));
        list.traverse();

        System.out.println("+++append: O(n)+++");
        list.append(new Node(6));
        list.traverse();

        System.out.println("+++delete first Occur: O(n)+++");
        list.deleteFirstOccurence(new Node(2));
        list.traverse();

        System.out.println("+++DoubleLinkedList+++");
        DoubleLinkedList dList = new DoubleLinkedList(new DoubleNode(1));
        DoubleNode dSecond = new DoubleNode(2);
        DoubleNode dThird = new DoubleNode(3);
        dList.getHead().setNext(dSecond);
        dSecond.setPrevious(dList.getHead());
        dSecond.setNext(dThird);
        dThird.setPrevious(dSecond);

        dList.traverse();

        System.out.println("+++push: O(1)+++");
        dList.push(new DoubleNode(4));
        dList.traverse();

        System.out.println("+++append: O(1)+++");
        dList.append(new DoubleNode(5));
        dList.traverse();
    }
}
