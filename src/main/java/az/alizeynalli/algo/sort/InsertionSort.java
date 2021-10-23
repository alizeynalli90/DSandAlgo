package az.alizeynalli.algo.sort;

//time complexity O(n^2)
public class InsertionSort {


    public static void main(String[] args) {
        int[] unsortedArray = {1, 2, 5, 3, 6};

        for (int i : sort(unsortedArray)) {
            System.out.println(i);
        }
    }

    private static int[] sort(int[] unsorted) {
        for (int i = 0; i < unsorted.length - 1; i++) {
            int current = unsorted[i];
            int j = i - 1;
            while (j >= 0 && unsorted[j] > current) {
                unsorted[j + 1] = unsorted[j];
                j = j - 1;
            }
            unsorted[j + 1] = current;
        }
        return unsorted;
    }

}
