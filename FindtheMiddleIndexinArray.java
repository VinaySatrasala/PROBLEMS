public class FindtheMiddleIndexinArray {
    public static void main(String[] args) {
        findMiddleIndex(new int[]{2,5});
    }
    static int findMiddleIndex(int[] nums) {
        int sum = 0;
        int temp = 0;
        for(int i = 0 ; i < nums.length ; i++){
            sum += nums[i];
        }

        for(int j=0 ; j < nums.length ; j++){
                sum -= nums[j];
            
            if(sum == temp)return j;
                temp += nums[j];
        }
        return -1;

    }
}
