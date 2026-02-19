public class SelectionSort {

    public static void selectionSort(int[] A) {
        int n = A.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (A[j] < A[minIndex]) {
                    minIndex = j;
                }
            }

            // swap A[i] and A[minIndex]
            int temp = A[i];
            A[i] = A[minIndex];
            A[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int[] A = {29, 10, 14, 37, 13};

        selectionSort(A);

        System.out.println("Sorted array:");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
    }
}
