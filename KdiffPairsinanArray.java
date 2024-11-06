import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class KdiffPairsinanArray {
    public static void main(String[] args) {
        int[] nums={3,5};
        System.out.println(twoSum(nums, 2));
    }
    static int findPairs(int[] nums, int k) {

        return 0;
    }
    static Set<String> twoSum(int[] nums, int target) {
        Map<Integer,Integer> ans=new HashMap<>();
        Set<String> pair=new HashSet<>();
        int[] res={0,0};
        for (int i = 0; i < nums.length; i++) {
            // int x=Math.abs();
            if(ans.containsKey(nums[i]-target)){
                res[0]=Math.min(ans.get(target-nums[i]),i);
                res[1]=Math.max(ans.get(target-nums[i]),i);
                pair.add(Arrays.toString(res));
                res[0]=0;
                res[1]=0;
            }
            ans.put(nums[i], i);
        }

        return pair;
    }
}
