package in.suman.searching;

class SearchSortedMatrix1D {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        if (rows == 0) return false;
        int cols = matrix[0].length;

        int left = 0;
        int right = rows * cols - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midValue = matrix[mid / cols][mid % cols]; // Map 1D index to 2D

            if (midValue == target) {
                return true;
            } else if (midValue < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}
