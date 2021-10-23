package az.alizeynalli.algo.sort;

public class MergeSort {

    public static void sort(int[] array, int length) {
        if (length < 2) {
            return;
        }
        int middle = length / 2;
        int[] left = new int[middle];
        int[] right = new int[length - middle];

        for (int i = 0; i < middle; i++) {
            left[i] = array[i];
        }
        for (int i = middle; i < length; i++) {
            right[i - middle] = array[i];
        }
        sort(left, middle);
        sort(right, length - middle);

        merge(array, left, right, middle, length - middle);
    }

    private static void merge(int[] array, int[] leftArray, int[] rightArray, int left, int right) {
        int i = 0, j = 0, k = 0;

        while (i < left && j < right) {
            if (leftArray[i] <= rightArray[j]) {
                array[k++] = leftArray[i++];
            } else {
                array[k++] = rightArray[j++];
            }
        }
        while (i < left) {
            array[k++] = leftArray[i++];
        }
        while (j < right) {
            array[k++] = rightArray[j++];
        }
    }

    public static void main(String[] args) {
        int[] actual = {5, 1, 6, 2, 3, 4};
        sort(actual, actual.length);
    }


}
