package sort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {3, 44, 38, 5, 47, 36, 26, 2, 36, 4, 19, 50, 48};
        System.out.println("arr = " + Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(int[] arr, int low, int high) {
        int pivot;
        if (low < 0 || high >= arr.length || low >= high) {
            return;
        }
        pivot = partition(arr, low, high);
        quickSort(arr, low, pivot - 1);
        quickSort(arr, pivot + 1, high);
    }

    private static int partition(int[] arr, int low, int high) {
        int pivotVal = arr[low];

        // swap lower item to the tempPivotIndex, then the tempPivotIndex move forward.
        int tempPivotIndex = low + 1;
        for (int i = tempPivotIndex; i <= high; i++) {
            if (arr[i] < pivotVal) {
                swap(arr, tempPivotIndex, i);
                tempPivotIndex++;
            }
        }

        int pivot = tempPivotIndex - 1;
        swap(arr, low, pivot);

        System.out.println(String.format("low=%s, high=%s, pivot=%s", low, high, pivot));
        System.out.println("arr = " + Arrays.toString(arr));

        return pivot;
    }

    private static void swap(int[] arr, int index1, int index2) {
        if (index1 != index2) {
            int temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;
        }

    }

}
