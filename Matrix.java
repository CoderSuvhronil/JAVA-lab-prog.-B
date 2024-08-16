class Matrix {
    // Method to find the sum of left and right diagonals of a matrix
    public void sumDiagonals(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int leftDiagonalSum = 0;
        int rightDiagonalSum = 0;
        
        for (int i = 0; i < m; i++) {
            leftDiagonalSum += matrix[i][i];
            rightDiagonalSum += matrix[i][n - i - 1];
        }
        
        System.out.println("Sum of Left Diagonal: " + leftDiagonalSum);
        System.out.println("Sum of Right Diagonal: " + rightDiagonalSum);
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        Matrix mat = new Matrix();
        mat.sumDiagonals(matrix);
    }
}
