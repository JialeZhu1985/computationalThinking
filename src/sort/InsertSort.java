package sort;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {3, 44, 38, 5, 47, 36, 26, 2, 36, 4, 19, 50, 48};
        System.out.println("arr = " + Arrays.toString(arr));
        insertSort(arr);
    }

    public static void insertSort(int[] arr) {
        int i, j, v;
        for (i = 0; i < arr.length; i++) {
            v = arr[i];
            j = i;

            while (j > 0 && v < arr[j - 1]) {
                arr[j] = arr[j - 1];
                j--;
                System.out.println("i=" + i + ", j=" + j + ",arr = " + Arrays.toString(arr));
            }

            arr[j] = v;

            System.out.println("i=" + i + ", j=" + j + ",arr = " + Arrays.toString(arr));
        }
    }

}
