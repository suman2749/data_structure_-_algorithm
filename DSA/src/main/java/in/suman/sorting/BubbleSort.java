package in.suman.sorting;

public class BubbleSort {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped; // Flag to optimize: if no swaps occur in a pass, the array is sorted.

        for (int i = 0; i < n - 1; i++) {
            swapped = false; // Reset swapped flag for each pass
            for (int j = 0; j < n - 1 - i; j++) {
                // Compare adjacent elements
                if (arr[j] > arr[j + 1]) {
                    // Swap them if they are in the wrong order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true; // A swap occurred
                }
            }
            // If no two elements were swapped by inner loop, then break
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] data = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Array before sorting:");
        for (int num : data) {
            System.out.print(num + " ");
        }
        System.out.println();

        bubbleSort(data);

        System.out.println("Array after sorting:");
        for (int num : data) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}