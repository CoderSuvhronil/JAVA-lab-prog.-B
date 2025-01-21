import java.util.Arrays;

public class Sparse {
    public void toTripletFormat(int sp_matrix[][]) {
        int m = sp_matrix.length;
        int n = sp_matrix[0].length;

        int nonZeroCount = 0;

        // Count non-zero elements
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (sp_matrix[i][j] != 0) {
                    nonZeroCount++;
                }
            }
        }

        // Create triplet array
        int triplet[][] = new int[nonZeroCount + 1][3];
        triplet[0][0] = m;
        triplet[0][1] = n;
        triplet[0][2] = nonZeroCount;

        int k = 1;

        // Fill the triplet array
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (sp_matrix[i][j] != 0) {
                    triplet[k][0] = i;
                    triplet[k][1] = j;
                    triplet[k][2] = sp_matrix[i][j];
                    k++;
                }
            }
        }

        // Print the triplet representation
        System.out.println("Triplet Representation:");
        for (int i = 0; i < triplet.length; i++) {
            System.out.println(Arrays.toString(triplet[i]));
        }
    }

    public static void main(String args[]) {
        int[][] sp_matrix = {{0, 0, 3}, {4, 0, 0}, {0, 2, 0}};
        Sparse sp = new Sparse();
        sp.toTripletFormat(sp_matrix);
    }
}
