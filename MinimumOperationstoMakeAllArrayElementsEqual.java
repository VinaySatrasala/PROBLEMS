import java.util.ArrayList;
import java.util.List;

public class MinimumOperationstoMakeAllArrayElementsEqual {
    public static void main(String[] args) {
        
    }
    public List<Long> minOperations(int[] nums, int[] queries) {
        List<Long> ans=new ArrayList<>();
        for (int i : queries) {
            long t=0;
            for (int j : nums) {
                t+=Math.abs(i-j);
            }
            ans.add(t);
        }
        return ans;
    }
}
