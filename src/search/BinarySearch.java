package search;


public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 19, 26, 36, 38, 44, 46, 47, 48, 50};
        System.out.println(binarySearch(arr, 19, 0, arr.length - 1));
        System.out.println(binarySearch(arr, 20, 0, arr.length - 1));

    }

    /* arr:有序数组，key:待查找元素，low:数组低位索引，high数组高位索引 */
    private static int binarySearch(int[] arr, int key, int low, int high) {
        if (key < arr[low] || key > arr[high] || low > high) {
            return -1;
        }

        int middle = (low + high) / 2;
        if (arr[middle] > key) {
            return binarySearch(arr, key, low, middle - 1);
        } else if (arr[middle] < key) {
            return binarySearch(arr, key, middle + 1, high);
        } else {
            return middle;
        }
    }
}
