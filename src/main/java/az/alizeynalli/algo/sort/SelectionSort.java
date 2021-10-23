package az.alizeynalli.algo.sort;

//time complexity O(n^2)
public class SelectionSort {

    public static void main(String[] args) {
        int[] unsortedArray = {1, 2, 5, 3, 6};

        for (int i : sort(unsortedArray)) {
            System.out.println(i);
        }
    }

    private static int[] sort(int[] unsorted) {
        for (int i = 0; i < unsorted.length - 2; i++) {
            int minIndex = i;
            for (int j = i + 1; j < unsorted.length - 1; j++) {
                if (unsorted[j] < unsorted[minIndex]) {
                    minIndex = j;
                }
                int temp = unsorted[minIndex];
                unsorted[minIndex] = unsorted[i];
                unsorted[i] = temp;
            }
        }
        return unsorted;
    }

}
