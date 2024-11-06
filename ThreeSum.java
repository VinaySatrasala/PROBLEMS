import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-1,0,1,2,-1,-4}));
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(ans,nums,0,0,0,new ArrayList<>());

        return ans;
    }
    private static void helper(List<List<Integer>> ans, int[] nums, int sum, int count,int index,List<Integer> temp) {
        if(index == nums.length){
            return;
        }
        if(count == 3){
            if(sum == 0){

                List<Integer> t = new ArrayList<>(temp);
                Collections.sort(t);
                if(!ans.contains(t)){
                    ans.add(t);
                }
            }
            return;
        }

        for (int i = index; i < nums.length; i++) {
            temp.add(nums[i]);
            int k = temp.size() - 1;
            helper(ans, nums, sum + nums[i], count + 1, index + 1 , temp);
            temp.remove(index);
        }
    }
}
