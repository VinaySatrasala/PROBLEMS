public class FindtheArrayConcatenationValue {
    public static void main(String[] args) {
        
    }
    public long findTheArrayConcVal(int[] nums) {
        int i=0;
        int j=nums.length-1;
        long ans=0;
        while(i < j){
            long k=(long) (nums[i]*Math.pow(10, (Math.log10(nums[j])+1)));
            ans=ans+k+nums[j];
        }
        if( i == j){
            ans=ans+nums[i];
        }
        return ans;
    }
}
