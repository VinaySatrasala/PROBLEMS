import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ReplaceElementsinaArray {
    public static void main(String[] args) {
        int[] nums = {1,2,4,6};
        int[][] operations = {{1,3},{4,7},{6,1}};
        System.out.println(Arrays.toString(arrayChange(nums, operations)));
    }
    static int[] arrayChange(int[] nums, int[][] operations) {
        Map<Integer,Integer> ans=new HashMap<>();
        for (int[] is : operations) {
            ans.put(is[0],is[1]);
        }
        int i=0;
        while (i < nums.length) {
            if(ans.containsKey(nums[i])){
                nums[i]= ans.get(nums[i]);
            }else{
                i++;
            }
        }
        return nums;
    }
}
