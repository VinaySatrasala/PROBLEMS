import java.util.Arrays;

public class MinimumSizeSubarraySum {
    public static void main(String[] args) {
        int[] nums = {2,3,1,2,4,3};
        int target = 7;
        System.out.println(findr(nums, target));
    }
    static int findr(int[] nums,int target){
        int min_length = 100000;
        int window = 0;
        while(window < nums.length){
            int i = 0;
            int j = i+window;
            while(j < nums.length){
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum+=nums[k];
                }
                if(sum >= target){
                    if(window < min_length){
                        // System.out.println(Arrays.toString(Arrays.copyOf(nums,)));
                        min_length = window;
                    }
                }

                i++;
                j++;
            }
            window++;
        }

        return min_length;
    }
}
