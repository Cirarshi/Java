package mtrixSum;

public class matrixSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2 = {{10, 11, 12}, {13, 14, 15}, {16, 17, 18}};

        int[][] sumMatrix = sumOfMatrices(matrix1, matrix2);

        // Print the sum matrix
        for (int[] row : sumMatrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
	}
	
	public static int[][] sumOfMatrices(int[][] matrix1, int[][] matrix2) {
        // Check if matrices have compatible dimensions
        if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
            throw new IllegalArgumentException("Matrices have incompatible dimensions.");
        }

        // Create a new matrix to store the sum
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] sumMat = new int[rows][cols];

        // Calculate the sum of corresponding elements
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sumMat[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Return the resulting matrix
        return sumMat;
    }

}
