package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Sum {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 5};
        List<Integer> array = new ArrayList<>();
        array.add(5);
        array.add(51);
        array.add(3);

        System.out.println(sum(arr, arr.length));
    }

    public static int sum(int[] arr, int n) {
        if (n <= 1) {
            return 0;
        }
        return sum(arr, n - 1) + arr[n - 1];
    }
}