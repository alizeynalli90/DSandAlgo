package az.alizeynalli.dt.collection;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class IterableInterface {

    public static void main(String[] args) {
        Collection<Integer> fibonachi = Arrays.asList(1, 1, 2, 3, 5, 8, 13, 21, 34, 55);
        Iterator<Integer> iterator = fibonachi.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

}
