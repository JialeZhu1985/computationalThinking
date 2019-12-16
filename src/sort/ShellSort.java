package sort;

import java.util.Arrays;

public class ShellSort {
    public static void main(String[] args) {
        int[] arr = {3, 44, 38, 5, 47, 36, 26, 2, 36, 4, 19, 50, 48};
        System.out.println("arr = " + Arrays.toString(arr));
        shellSort(arr);
    }

    public static void shellSort(int[] arr) {
        int[] hArr = {5, 3, 1};
        for (int h : hArr) {
            sort(arr, h);
        }
    }


    public static void sort(int[] arr, int h) {
        int i, j, v;
        for (i = h; i < arr.length; i += h) {
            v = arr[i];
            j = i;

            while (j - h >= 0 && v < arr[j - h]) {
                arr[j] = arr[j - h];
                j = j - h;
                System.out.println("h=" + h + ", i=" + i + ", j=" + j + ",arr = " + Arrays.toString(arr));
            }

            arr[j] = v;

            System.out.println("h=" + h + ", i=" + i + ", j=" + j + ",arr = " + Arrays.toString(arr));
        }
    }

}

