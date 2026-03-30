package problem5;

import java.util.*;

public class Problem5 {

    public static void run() {
        String[] arr = {"accB", "accA", "accB", "accC"};

        linearSearch(arr, "accB");
        Arrays.sort(arr);
        binarySearch(arr, "accB");
    }

    static void linearSearch(String[] arr, String target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(target)) {
                System.out.println("Linear Found at: " + i);
                return;
            }
        }
    }

    static void binarySearch(String[] arr, String target) {
        int low = 0, high = arr.length - 1;
        int count = 0;

        while (low <= high) {
            int mid = (low + high) / 2;
            count++;

            if (arr[mid].equals(target)) {
                System.out.println("Binary Found at: " + mid + " comparisons: " + count);
                return;
            } else if (arr[mid].compareTo(target) < 0)
                low = mid + 1;
            else
                high = mid - 1;
        }
    }
}