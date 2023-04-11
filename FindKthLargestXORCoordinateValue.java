import java.util.ArrayList;
import java.util.Collections;

public class FindKthLargestXORCoordinateValue {
    public static void main(String[] args) {
        
    }
    public int kthLargestValue(int[][] matrix, int k) {
        ArrayList<Integer> ans=new ArrayList<>();
        for (int[] x : matrix) {
            int a=x[0];
            int b=x[1];
            int c=a^b;
            if(!ans.contains(a)){
                ans.add(a);
            }
            if(!ans.contains(b)){
                ans.add(b);
            }
            if(!ans.contains(c)){
                ans.add(c);
            }
        }
        
        Collections.sort(ans);
        
        return ans.get(ans.size()-k);   


    }
}
