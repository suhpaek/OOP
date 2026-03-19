package bonus;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = {7, 3, 5, 3, 0, 10, 1, 2, 2, 9};

        System.out.println("Before sorting:");
        System.out.println(Arrays.toString(arr));

        int[] sorted = FrequencySort.sort(arr);

        System.out.println("After sorting:");
        System.out.println(Arrays.toString(sorted));
    }
}