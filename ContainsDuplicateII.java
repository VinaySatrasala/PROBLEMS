import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateII {
    public static void main(String[] args) {
        // Map<Integer,Integer> ans=new HashMap<>();
        // ans.entrySet(10,1);
    }
    static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> ans=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(ans.containsKey(nums[i])){
                if(Math.abs(ans.get(nums[i]) - i) <=k){
                    return true;
                }
            }
            ans.put(nums[i], i);
        }
       return false; 
    }
}
