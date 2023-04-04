import java.util.Arrays;

public class ProductofArrayExceptSelf {
    public static void main(String[] args) {
        productExceptSelf(new int[]{1,2,3,4});
    }
    static void productExceptSelf(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int start=1;
        int end=1;
        int[] ans=new int[nums.length];
        for(int m=0;m<ans.length;m++){
            ans[m] =1;
        }
        while(i<nums.length && j>=0){
            ans[i] *= start;
            start*=nums[i];
            ans[j] *= end;
            end*=nums[j];   
            i++;
            j--;
        }
        
        System.out.println(Arrays.toString(ans));
        // return nums;

    }
}
