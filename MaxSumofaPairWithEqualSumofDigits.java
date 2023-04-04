public class MaxSumofaPairWithEqualSumofDigits {
    public static void main(String[] args) {
        
    }
    static int maximumSum(int[] nums) {
        int[] digsum=new int[nums.length];
        int max=-100;
        for (int i = 0; i < digsum.length; i++) {
            if(digsum[i] == 0){
                digsum[i] = dig(nums[i]);
            }
            for (int j = i+1; j < digsum.length; j++) {
                if(digsum[j] == 0){
                    digsum[j] = dig(nums[j]);
                }
                if(digsum[i] == digsum[j] && nums[i] + nums[j] > max){
                    max=nums[i]+nums[j];
                }
            }
        }
        return max; 
    }
    static int dig(int n){
        int ans=0;
        while(n>0){
            ans+=n%10;
            n=n/10;
        }
        return ans;
    }
}
