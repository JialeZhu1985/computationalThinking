package sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3, 44, 38, 5, 47, 36, 26, 2, 46, 4, 19, 50, 48};
        System.out.println("arr = " + Arrays.toString(arr));
        bubbleSort(arr);
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {//外层循环控制排序趟数
            boolean swapped = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {//内层循环控制每一趟排序多少次
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
                System.out.println("i=" + i + ", j=" + j + ",arr = " + Arrays.toString(arr));
            }
            if (!swapped) {
                break;
            }
        }
    }

}
