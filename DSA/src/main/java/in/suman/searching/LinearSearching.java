package in.suman.searching;

public class LinearSearching {

    /**
     * Performs a linear search on an array to find a target value.
     *
     * @param arr The array to search within.
     * @param target The value to search for.
     * @return The index of the target value if found, otherwise -1.
     */
    public static int linearSearch(int [] arr, int target){
        // Iterate through each element in the array
        for (int i=0; i<arr.length; i++){
            // if the current element matches the target, return its index
            if(arr[i] == target){
                return i;
            }
        }
        // If the target is not found, return -1
        return -1;
    }
    public static void main(String[] args) {

        int[] numbers = {4, 2, 7, 1, 9, 5};
        int targetValue1 = 7;
        int targetValue2 = 10;

        int result1 = linearSearch(numbers, targetValue1);
        if (result1 != -1) {
            System.out.println("Element " + targetValue1 + " found at index: " + result1);
        } else {
            System.out.println("Element " + targetValue1 + " not found in the array.");
        }

        int result2 = linearSearch(numbers, targetValue2);
        if (result2 != -1) {
            System.out.println("Element " + targetValue2 + " found at index: " + result2);
        } else {
            System.out.println("Element " + targetValue2 + " not found in the array.");
        }
    }
}
