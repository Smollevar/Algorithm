package BinarySearch;

public class BSRecursion {
    public static void main(String[] args) {
        int[] arr = new int[]{-2452, -235, -46, -1, 0, 2, 23, 35, 523, 52356};
        System.out.println(binarySearch(arr, -242456, 0, arr.length));

    }

    public static int binarySearch(int[] array, int key, int low, int high) {
        int middle = low + (high - low) / 2;
        if (array[middle] == key)
            return middle;
        else if (low >= high || key > array[array.length - 1] || key < array[low])
            return -1;
        if (key < array[middle])
            return binarySearch(array, key, low, high = middle - 1);
        else if (key > array[middle])
            return binarySearch(array, key, low = middle + 1, high);
        else
            return middle;
    }
}
