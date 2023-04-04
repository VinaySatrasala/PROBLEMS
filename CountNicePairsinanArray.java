import java.util.HashMap;
import java.util.Map;

public class CountNicePairsinanArray /*1814*/{
    public static void main(String[] args) {
        
    }
    public int countNicePairs(int[] nums) {
        Map<Integer,Integer> ans=new HashMap();
        int max=0;
        for (int i : nums) {
            int res=i - rev(i);
            if(!ans.containsKey(res)){
                ans.put(res,1);
            }else{
                int c=ans.get(res);
                ans.replace(res, c++);
            }
            if(ans.get(res) > max){
                max=ans.get(res);
            }
        }
        return max;
    }
    static int rev(int n){
        int ans=0;
        while(n > 0){
            ans=ans*10 + n%10;
            n=n/10;
        }
        return ans;
    }
}
