package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Counter {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(2);
        arr.add(2);
        arr.add(2);
        System.out.println(counter(arr));
    }

    public static int counter(List<Integer> arr) {
        if (arr.isEmpty())
            return 0;
        arr.remove(0);
        return 1 + counter(arr);
    }
}
