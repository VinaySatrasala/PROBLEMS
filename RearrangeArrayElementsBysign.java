public class RearrangeArrayElementsBysign {
    public static void main(String[] args) {
        
    }
    public int[] rearrangeArray(int[] nums) {
        int j=1;
        int i=0;
        while(i<nums.length){
            if(nums[i] > 0){
                i+=2;
            }else{
                if(nums[j] > 0){
                    int t=nums[j];
                    nums[j]=nums[i];
                    nums[i] = t;
                }else{
                    j++;
                }
            }
        }


        return nums;
    }
}
