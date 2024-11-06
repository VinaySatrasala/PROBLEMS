import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MajorityElementII {
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{1,2}));;
    }
    static List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> ans=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(ans.containsKey(nums[i])){
                int k=ans.get(nums[i]);
                ans.replace(nums[i], ++k);
            }else{
                ans.put(nums[i], 1);
            }
        }
        List<Integer> an=new ArrayList<>();
        for (int k : nums) {
            if(!an.contains(k) && ans.get(k) > nums.length/3){
                an.add(k);
            }
        }
        return an;
    }
}
