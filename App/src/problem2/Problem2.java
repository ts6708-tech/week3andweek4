package problem2;

import model1.Client;
import java.util.*;

public class Problem2 {

    public static void run() {
        Client[] arr = {
                new Client("clientC", 80, 5000),
                new Client("clientA", 20, 2000),
                new Client("clientB", 50, 3000)
        };

        bubbleSort(arr);
        System.out.println("Bubble ASC: " + Arrays.toString(arr));

        insertionSortDesc(arr);
        System.out.println("Insertion DESC: " + Arrays.toString(arr));

        printTopRisk(arr);
    }

    static void bubbleSort(Client[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].riskScore > arr[j + 1].riskScore) {
                    Client temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    static void insertionSortDesc(Client[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Client key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].riskScore < key.riskScore) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    static void printTopRisk(Client[] arr) {
        System.out.println("Top Risks:");
        for (int i = 0; i < Math.min(10, arr.length); i++) {
            System.out.println(arr[i]);
        }
    }
}