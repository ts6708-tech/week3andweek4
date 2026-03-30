package problem3;

import model1.Trade;
import java.util.*;

public class Problem3 {

    public static void run() {
        Trade[] arr = {
                new Trade("trade3", 500),
                new Trade("trade1", 100),
                new Trade("trade2", 300)
        };

        mergeSort(arr, 0, arr.length - 1);
        System.out.println("Merge Sort: " + Arrays.toString(arr));

        quickSort(arr, 0, arr.length - 1);
        reverse(arr);
        System.out.println("Quick Sort DESC: " + Arrays.toString(arr));

        int total = totalVolume(arr);
        System.out.println("Total Volume: " + total);
    }

    // MERGE SORT
    static void mergeSort(Trade[] arr, int l, int r) {
        if (l < r) {
            int mid = (l + r) / 2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);
            merge(arr, l, mid, r);
        }
    }

    static void merge(Trade[] arr, int l, int m, int r) {
        Trade[] temp = new Trade[r - l + 1];
        int i = l, j = m + 1, k = 0;

        while (i <= m && j <= r) {
            if (arr[i].volume <= arr[j].volume)
                temp[k++] = arr[i++];
            else
                temp[k++] = arr[j++];
        }

        while (i <= m) temp[k++] = arr[i++];
        while (j <= r) temp[k++] = arr[j++];

        System.arraycopy(temp, 0, arr, l, temp.length);
    }

    // QUICK SORT
    static void quickSort(Trade[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    static int partition(Trade[] arr, int low, int high) {
        int pivot = arr[high].volume;
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j].volume < pivot) {
                i++;
                Trade temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        Trade temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    static void reverse(Trade[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            Trade temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    static int totalVolume(Trade[] arr) {
        int sum = 0;
        for (Trade t : arr) sum += t.volume;
        return sum;
    }
}