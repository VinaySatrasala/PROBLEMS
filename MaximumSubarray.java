import java.util.Arrays;

public class MaximumSubarray {
    public static void main(String[] args) {
        int[] nums = {1,2,-1};
        System.out.println(maxSubArray(nums));
    }
    static int maxSubArray(int[] nums) {
        int[] prefix = new int[nums.length + 1];
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i - 1];
            if(max < nums[i-1]){
                max = nums[i-1];
            }
        }

        int size = nums.length -1;
        int fmax = prefix[prefix.length - 1];
        while(size > 1){
            int sum = prefix[size];
            fmax = Math.max(fmax, sum);
            System.out.println(sum);
            int p = 0;
            for (int i = size; i < nums.length; i++) {
                sum = sum - nums[p] + nums[i];
                System.out.println(sum);
                fmax = Math.max(fmax, sum);
                p++;
            }
            size--;
        }
        System.out.println(fmax);
        return Math.max(max,fmax);

    }
}
