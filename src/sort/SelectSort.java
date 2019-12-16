package sort;

import java.util.Arrays;

public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {3, 44, 38, 5, 47, 36, 26, 2, 36, 4, 19, 50, 48};
        System.out.println("arr = " + Arrays.toString(arr));
        sort(arr);
    }

    public static void sort(int[] arr) {
        int i, j;
        for (i = 0; i < arr.length; i++) {

            // find min value in the unsorted list.
            int minValueIndex = i;
            for (j = i; j < arr.length; j++) {
                if (arr[j] < arr[minValueIndex]) {
                    minValueIndex = j;
                }
            }

            // swap min value to its position.
            int tmp = arr[i];
            arr[i] = arr[minValueIndex];
            arr[minValueIndex] = tmp;

            System.out.println("i=" + i + ", j=" + j + ",arr = " + Arrays.toString(arr));
        }
    }

}
