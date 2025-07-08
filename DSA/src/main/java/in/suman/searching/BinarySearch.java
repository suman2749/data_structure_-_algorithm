package in.suman.searching;

public class BinarySearch {

    public static int binarySearch(int [] arr,int target){
        int low =0;
        int high = arr.length - 1;

        while (low <= high){
            int mid = low + (high - low) / 2; // To avoid overflow

            if(arr[mid] == target){
                return mid; // Target found
            } else if(arr[mid] < target){
                low = mid + 1; // Search in the right half
            } else {
                high = mid - 1; // Search in the left half
            }
        }
        return -1; // Target not found
    }
    public static void main(String[] args) {
        int[] sortedArray = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int targetValue = 23;

        int index = binarySearch(sortedArray, targetValue);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }

    }
}
