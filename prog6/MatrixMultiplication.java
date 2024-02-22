public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] firstMatrix = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        int[][] secondMatrix = { {9, 8, 7}, {6, 5, 4}, {3, 2, 1} };

        int[][] resultMatrix = multiplyMatrices(firstMatrix, secondMatrix);

        // Displaying the result
        System.out.println("Resultant Matrix:");
        displayMatrix(resultMatrix);
    }

    public static int[][] multiplyMatrices(int[][] firstMatrix, int[][] secondMatrix) {
        int m = firstMatrix.length;
        int n = secondMatrix[0].length;
        int[][] result = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < firstMatrix[0].length; k++) {
                    result[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }
        return result;
    }

    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
