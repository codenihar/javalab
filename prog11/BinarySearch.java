public class BinarySearch {
    // Overloaded search method for integer array
    public static int search(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == key)
                return mid;
            else if (arr[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return -1; // Key not found
    }

    // Overloaded search method for double array
    public static int search(double[] arr, double key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == key)
                return mid;
            else if (arr[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return -1; // Key not found
    }

    public static void main(String[] args) {
        int[] intArray = {1, 3, 5, 7, 9, 11, 13, 15};
        double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8};

        int intKey = 7;
        double doubleKey = 5.5;

        // Search integer array
        int intResult = search(intArray, intKey);
        if (intResult != -1)
            System.out.println("Integer key " + intKey + " found at index: " + intResult);
        else
            System.out.println("Integer key " + intKey + " not found");

        // Search double array
        int doubleResult = search(doubleArray, doubleKey);
        if (doubleResult != -1)
            System.out.println("Double key " + doubleKey + " found at index: " + doubleResult);
        else
            System.out.println("Double key " + doubleKey + " not found");
    }
}
