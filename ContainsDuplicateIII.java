import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateIII {
    public static void main(String[] args) {
        
    }
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(Math.abs(i) <= indexDiff){
                    if(Math.abs(nums[i] - nums[j]) <= valueDiff){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
