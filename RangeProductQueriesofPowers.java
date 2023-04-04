import java.util.ArrayList;
import java.util.List;

public class RangeProductQueriesofPowers {
    public static void main(String[] args) {
        int n=8787;

            List<Integer> ans=new ArrayList<>();
            while(n!=0){
                if(ans.contains(n & -n)){
                    break;
                }
                ans.add(n&-n);
                n=n&~(n&-n);
            }
        System.out.println(ans);
  
    }
    public int[] productQueries(int n, int[][] queries) {
        List<Integer> ans=new ArrayList<>();
        while(n != 0){
            int set=(n & -n )-1;
            n= n& ~(1<<set);
            ans.add(1<<set);
        }

        
        
        
        return new int[]{};   

    }
}
