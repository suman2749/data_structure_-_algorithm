package in.suman.searching;

public class SearchUnsortedMatrix {

    public boolean searchMatrix(int [][] matrix, int target){
        int rows = matrix.length;
        if (rows == 0) return false; // Check if the matrix is empty
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == target) {
                    return true; // Target found
                }
            }
        }
        return false; // Target not found
    }
    public static void main(String[] args) {

        SearchUnsortedMatrix search = new SearchUnsortedMatrix();
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
