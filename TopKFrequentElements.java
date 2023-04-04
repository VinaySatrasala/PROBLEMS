import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElements {
    public static void main(String[] args) {
        topKFrequent(new int[]{1,1,1,2,2,3,3}, 2);
    }
    static int[] topKFrequent(int[] nums, int k) {
        List<Integer> ans=new ArrayList<>();
        Map<Integer,Integer> maps=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(maps.containsKey(nums[i])){
                int x=maps.get(nums[i]);
                maps.replace(nums[i], ++x);
            }else{
                maps.put(nums[i],1);
            }
            
        }
        
        int[] arr = ans.stream().mapToInt(i -> i).toArray();
        return arr;
    }
}
