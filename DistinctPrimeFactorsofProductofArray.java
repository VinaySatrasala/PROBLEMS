import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DistinctPrimeFactorsofProductofArray {
    public static void main(String[] args) {
        System.out.println(distinctPrimeFactors(new int[]{2,4,3,7,10,6}));
    }
    static int distinctPrimeFactors(int[] nums) {
        Arrays.sort(nums);
        Set<Integer> ans=new HashSet<>();
        boolean[] primes=new boolean[nums[nums.length-1]+1];
        Prime(primes);
        for (int i : nums) {
            int c=1;
            while (c*c <= i) {
                if(i%c == 0){
                    int k=i/c;
                    if(!primes[c] && c!=1){
                        // System.out.println(c);
                        ans.add(c);
                    }
                    if(i == c)continue;
                    if(!primes[k]){
                        System.out.println(k);
                        ans.add(k);
                    }
                }
                c++;
            }
        }
        return ans.size();
    }
    static void Prime(boolean[] primes){
        int n=primes.length-1;
        for (int i = 2; i*i<=n;i++) {
            if(!primes[i]){
                for (int j = 2*i; j <=n; j+=i) {
                    primes[j]=true;
                }
            }
        }
    }
}
