import java.util.Arrays;
import java.util.Scanner;

public class KthLargest {

    public static int findKthLargest(int[] arr, int k) {
        Arrays.sort(arr);  // Sort the array in ascending order
        return arr[arr.length - k];  // K-th largest is at index (n - k)
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Get array size
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();

        // Step 2: Get array elements
        int[] array = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Step 3: Get value of k
        System.out.print("Enter value of k: ");
        int k = scanner.nextInt();

        // Step 4: Validate and find k-th largest
        if (k <= 0 || k > n) {
            System.out.println("Invalid value of k. Must be between 1 and " + n);
        } else {
            int result = findKthLargest(array, k);
            System.out.println("The " + k + "-th largest element is: " + result);
        }

        scanner.close();
    }
}

