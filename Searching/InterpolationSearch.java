public class InterpolationSearch {

    public static int interpolationSearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high && key >= arr[low] && key <= arr[high]) {
            if (low == high) {
                if (arr[low] == key) return low;
                return -1;
            }

            // Estimate the position of the target using interpolation formula
            int pos = low + ((key - arr[low]) * (high - low)) / (arr[high] - arr[low]);

            // Check if the key is at the estimated position
            if (arr[pos] == key)
                return pos;

            // If key is larger, search the right subarray
            if (arr[pos] < key)
                low = pos + 1;

            // If key is smaller, search the left subarray
            else
                high = pos - 1;
        }
        return -1; // If the key is not found
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int key = 5;

        int result = interpolationSearch(arr, key);

        if (result != -1)
            System.out.println("Element found at index " + result);
        else
            System.out.println("Element not found.");
    }
}
