package problem6;

public class Problem6 {

    public static void run() {
        int[] arr = {10, 25, 50, 100};

        linearSearch(arr, 30);
        binaryFloorCeil(arr, 30);
    }

    static void linearSearch(int[] arr, int target) {
        for (int i : arr) {
            if (i == target) {
                System.out.println("Found");
                return;
            }
        }
        System.out.println("Not Found");
    }

    static void binaryFloorCeil(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        Integer floor = null, ceil = null;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                floor = ceil = arr[mid];
                break;
            }

            if (arr[mid] < target) {
                floor = arr[mid];
                low = mid + 1;
            } else {
                ceil = arr[mid];
                high = mid - 1;
            }
        }

        System.out.println("Floor: " + floor + " Ceiling: " + ceil);
    }
}