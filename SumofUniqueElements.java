import java.util.HashMap;
import java.util.Map;

public class SumofUniqueElements {
    public static void main(String[] args) {
        
    }
    public int sumOfUnique(int[] nums) {
        Map<Integer,Integer> mm=new HashMap<>();
        int ans=0;
        for (int i = 0; i < nums.length; i++) {
            if(!mm.containsKey(nums[i])){
                mm.put(nums[i],1);
            }else{
                mm.replace(nums[i], mm.get(nums[i]+1));
            }
        }
        
        for(int i=0;i<nums[i];i++){
            if(mm.get(nums[i]) == (Integer)1){
                ans+=nums[i];
            }
        }
        return ans;   
    }
}
