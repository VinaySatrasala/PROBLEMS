import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums={0,1,0,1,2,3,4,0,5};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
        
    }
    static void moveZeroes(int[] nums) {
        int i=0;
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != 0){
                int temp=nums[i];
                nums[i++] = nums[j];
                nums[j] = temp; 
            }
        }

    }
}
