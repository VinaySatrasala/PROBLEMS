import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        
    }
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans=new ArrayList<>();
        int left=0;
        int right=matrix[0].length-1;
        int top=0;
        int bottom=matrix.length-1;

        while(left<=right){
            // Loop 1
            for(int i=left;i<=right;i++){
                ans.add(matrix[top][i]);
            }
            top++;

            // Loop 2
            for (int i = top; i <= bottom; i++) {
                ans.add(matrix[i][right]);
            }
            right++;

            // Loop 3
            for (int i = right; i >= left; i--) {
                ans.add(matrix[bottom][i]);
            }
            bottom++;

            // Loop 4
            for (int i = bottom; i >= top; i--) {
                ans.add(matrix[left][i]);
            }
            left++;

        }


        return ans;
    }
}
