package az.alizeynalli.dt.collection;

import java.util.ListIterator;

public class LinkedList {

    public static void main(String[] args) {
        java.util.LinkedList<String> states = new java.util.LinkedList<String>();
        states.add("California");
        states.add("NYC");
        System.out.println(states);
        states.addFirst("D.C.");
        System.out.println(states);

        ListIterator<String> iterator = states.listIterator(states.size());
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }

}
