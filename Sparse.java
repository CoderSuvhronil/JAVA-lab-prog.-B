import java.util.Arrays;

class Sparse {
    // Represent a sparse matrix in Triplet format
    public void toTripletFormat(int[][] sparseMatrix) {
        int m = sparseMatrix.length;
        int n = sparseMatrix[0].length;
        
        int nonZeroCount = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (sparseMatrix[i][j] != 0) {
                    nonZeroCount++;
                }
            }
        }
        
        int[][] triplet = new int[nonZeroCount + 1][3];
        triplet[0][0] = m;
        triplet[0][1] = n;
        triplet[0][2] = nonZeroCount;
        
        int k = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (sparseMatrix[i][j] != 0) {
                    triplet[k][0] = i;
                    triplet[k][1] = j;
                    triplet[k][2] = sparseMatrix[i][j];
                    k++;
                }
            }
        }
        
        // Display the triplet format
        System.out.println("Triplet Representation:");
        for (int i = 0; i < triplet.length; i++) {
            System.out.println(Arrays.toString(triplet[i]));
        }
    }

    public static void main(String[] args) {
        int[][] sparseMatrix = {
            {0, 0, 3},
            {4, 0, 0},
            {0, 2, 0}
        };
        Sparse sparse = new Sparse();
        sparse.toTripletFormat(sparseMatrix);
    }
}
