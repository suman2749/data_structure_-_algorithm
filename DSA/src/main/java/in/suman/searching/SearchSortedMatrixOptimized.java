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
    public static void main(String[] args) {
        SearchSortedMatrixOptimized search = new SearchSortedMatrixOptimized();
        int[][] matrix = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60},
            {60, 61, 62, 63}
        };
        int target = 3;
        boolean found = search.searchMatrix(matrix, target);
        System.out.println("Target " + target + " found: " + found);
    }
}
