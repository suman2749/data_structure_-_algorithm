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

    }
}
