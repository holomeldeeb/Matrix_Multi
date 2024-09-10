public class MatrixMult {

    public static double[][] multiplyMatrices(double[][] firstMatrix, double[][] secondMatrix) {
        int rowsMatrix1 = firstMatrix.length;        
        int colsMatrix1 = firstMatrix[0].length;
        int rowsMatrix2 = secondMatrix.length;  
        int colsMatrix2 = secondMatrix[0].length;

        if (colsMatrix1 != rowsMatrix2) {
            System.out.println("Error: The number of columns in the first matrix must be equal to the number of rows in the second matrix.");
            return null;
        }
        double[][] productMatrix = new double[rowsMatrix1][colsMatrix2];

   
        for (int i = 0; i < rowsMatrix1; i++) {
            for (int j = 0; j < colsMatrix2; j++) {
                for (int k = 0; k < colsMatrix1; k++) {
                    productMatrix[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }

        return productMatrix;
    }

    public static void main(String[] args) {

        double[][] firstMatrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        double[][] secondMatrix = {
            {7, 8},
            {9, 10},
            {11, 12}
        };
        double[][] result = multiplyMatrices(firstMatrix, secondMatrix);
        if (result != null) {
            System.out.println("Product of the matrices:");
            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j < result[i].length; j++) {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}

