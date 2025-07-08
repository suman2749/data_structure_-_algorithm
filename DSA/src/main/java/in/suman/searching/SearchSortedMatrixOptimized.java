package in.suman.searching;

class SearchSortedMatrixOptimized {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        if (rows == 0) return false;
        int cols = matrix[0].length;

        int row = 0;
        int col = cols - 1; // Start from top-right corner

        while (row < rows && col >= 0) {
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] < target) {
                row++; // Move down if current element is too small
            } else {
                col--; // Move left if current element is too large
            }
        }
        return false;
    }
}
