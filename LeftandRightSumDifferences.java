import java.util.Arrays;

public class LeftandRightSumDifferences {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(leftRigthDifference(new int[]{10,4,8,3})));
    }
    static int[] leftRigthDifference(int[] nums) {
        int[] ans=new int[nums.length];
        
        int i=0;
        int j=nums.length-1;
        int start=0;
        int end=0;
        while(i < nums.length && j>=0){
            ans[i] = Math.abs(ans[i] - start);
            start += nums[i];
            ans[j] = Math.abs(ans[j] - end);
            end += nums[j];
            i++;
            j--;
        }
        return ans;

    }
}
