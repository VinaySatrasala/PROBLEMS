import java.util.HashSet;
import java.util.Set;

public class CountNumberofDistinctIntegersAfterReverseOperations {
    public static void main(String[] args) {
        
    }
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> ans=new HashSet<>();
        for (int i : nums) {
            ans.add(i);
            int res=0;
            while(i>0){
                res=res*10 +(i%10);
                i/=10; 
            }
            ans.add(res);
        }
        return ans.size();
    }
}
