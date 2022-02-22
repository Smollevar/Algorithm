package GreedyAlgorithms;

import java.util.ArrayList;
import java.util.List;

public class SelectionSort {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        array.add(2);
        array.add(3432);
        array.add(-42);
        array.add(-2);
        array.add(19);
        array.add(5);

        System.out.println(selectionSort(array));
    }

    public static List<Integer> selectionSort(List<Integer> arr) {
        List<Integer> newArr = new ArrayList<>();
        for (int i = 0; i < arr.size();) {
            int smallest = findSmallest(arr);
            newArr.add(arr.remove(smallest));
        }
        return newArr;
    }

    public static int findSmallest(List<Integer> arr) {
        int smallest = arr.get(0);
        int smallest_index = 0;
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) < smallest) {
                smallest = arr.get(i);
                smallest_index = i;
            }
        }
        return smallest_index;
    }
}
