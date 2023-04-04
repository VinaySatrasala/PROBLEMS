import java.util.HashMap;
import java.util.Map;

public class NextGreaterElementII {
    public static void main(String[] args) {
        
    }
    public int[] nextGreaterElements(int[] nums) {
        Map<Integer,Integer> an=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int ans=-1;
            if(an.containsKey(nums[i])){
                ans=an.get(nums[i]);
            }else{
                for (int j = i+1; j < nums.length; j++) {
                    if(nums[j] > nums[i]){
                        an.put(nums[i] , nums[j]);
                        ans=nums[j];
                        break;
                    }
                }
            }
            nums[i] = ans;
        }
        
        return nums;

    }
}
