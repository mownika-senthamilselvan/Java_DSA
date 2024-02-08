package array;

import java.util.Comparator;
import java.util.Arrays;

public class BasicArray {
    public static void main(String[] args) {
        Comparator<Integer> cmp = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                // Compare based on the last digit of each number
                if (o1 % 10 > o2 % 10) {
                    return 1;
                } else if (o1 % 10 < o2 % 10) {
                    return -1;
                } else {
                    return 0;
                }
            }
        };

        Integer[] arr = {45, 11, 89, 23};
        Arrays.sort(arr, cmp);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
