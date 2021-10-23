package az.alizeynalli.dt.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionInterface {

    public static void main(String[] args) {
        List<Integer> fibonachi = Arrays.asList(1, 1, 2, 3, 5, 8, 13, 21, 34, 55);
        System.out.println("position of 21 is: ");
        System.out.println(Collections.binarySearch(fibonachi, 21));
        System.out.println("max of fibonaci is: ");
        System.out.println(Collections.max(fibonachi));

    }

}
