import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FindKthLargestXORCoordinateValue {
    public static void main(String[] args) {
        
    }
    public int kthLargestValue(int[][] matrix, int k) {
        int[] xors = new int[matrix.length*matrix[0].length];
        
        int p = 0;
        for (int i = 0; i < xors.length; i++) {
            int ans = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                ans ^= matrix[i][j];
                xors[p++] = matrix[i][j];
            }
            
        }


        Arrays.sort(xors);


        return xors[xors.length - k];


    }
}
