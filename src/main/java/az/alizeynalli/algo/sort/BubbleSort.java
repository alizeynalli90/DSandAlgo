package az.alizeynalli.algo.sort;

// Bubble Sort is the simplest sorting algorithm
// that works by repeatedly swapping the adjacent elements if they are in wrong order.
//The algorithm needs one whole pass without any swap to know it is sorted.
// time complexity O(n^2)
public class BubbleSort {

    public static void main(String[] args) {
        int[] unsortedArray = {1, 4, 5, 3, 6, 9, 2, 7};

        sort(unsortedArray);
    }

    private static int[] sort(int[] unsorted) {
        for (int i = 0; i < unsorted.length - 2; i++) {
            for (int j = 1; j < unsorted.length - 2 - i; j++) {
                if (unsorted[j] > unsorted[j + 1]) {
                    int temp = unsorted[j + 1];
                    unsorted[j + 1] = unsorted[j];
                    unsorted[j] = temp;
                }
            }
        }
        return unsorted;
    }

}
