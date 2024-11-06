import java.util.ArrayList;
import java.util.List;

public class Subests {
    public static void main(String[] args) {
        int[] nums={1,2,3};
        System.out.println(helper(nums));
    }
    static List<List<Integer>> helper(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());
        for(int num : nums){
            int n = ans.size();
            for(int i=0;i<n;i++){
                List<Integer> temp = new ArrayList<>(ans.get(i));
                temp.add(num);
                ans.add(temp);
            }
        }
        return ans;
    }

}
