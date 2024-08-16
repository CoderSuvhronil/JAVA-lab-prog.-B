import java.util.Arrays;

class VOperations {
    private int[] arr;

    // Initialize the array
    public void initializer() {
        arr = new int[]{11, 6, 77, 8, 5, 44, 6, 9, 442, 86, 73, 49, 68, 82};
    }

    // Linear search for an element
    public int linearSearch(int se) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == se) {
                return i;
            }
        }
        return -1;
    }

    // Binary search for an element (array must be sorted)
    public int binSearch(int se) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == se) {
                return mid;
            } else if (arr[mid] < se) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    // Bubble sort the array
    public void bubbleSort() {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Display the elements in the array
    public void show() {
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        VOperations vOps = new VOperations();
        vOps.initializer();
        System.out.println("Array after initialization:");
        vOps.show();

        System.out.println("\nPerforming Bubble Sort:");
        vOps.bubbleSort();
        vOps.show();

        int searchElement = 49;
        System.out.println("\nLinear Search for " + searchElement + ":");
        int index = vOps.linearSearch(searchElement);
        System.out.println("Element found at index: " + index);

        System.out.println("\nBinary Search for " + searchElement + ":");
        index = vOps.binSearch(searchElement);
        System.out.println("Element found at index: " + index);
    }
}
