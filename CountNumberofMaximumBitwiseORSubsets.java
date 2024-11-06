import java.util.ArrayList;
import java.util.List;

public class CountNumberofMaximumBitwiseORSubsets {
    public int countMaxOrSubsets(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int max = 0;
        for (Integer integer : list) {
            max = Math.max(max,integer);
        }

        int count = 0;
        for (Integer integer : list) {
            if(integer == max){
                count++;
            }
        }
        return count;
    }
    public void helper(int[] nums,int index,int sum,List<Integer> list){
        if(index == nums.length){
            list.add(sum);
            return;
        }
        int or = sum|nums[index];
        helper(nums, index, sum, list);
        helper(nums, index, or, list);
    }
}
