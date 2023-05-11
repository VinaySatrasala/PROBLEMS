public class RotateFunction {
    public static void main(String[] args) {
        
    }
    static int maxRotateFunction(int[] nums) {
            int n = nums.length-1;
            if(n == 1){
                return 0;
            }
            int max=-1;
            for (int i = 0; i < nums.length; i++) {
                int exclude = (i-1 == -1)?n:(i-1);
                int k=i;
                int sum=0;
                int m=1;
                while(k != exclude){
                    sum+=(m++ * nums[k]);
                    k++;
                    k%=(n+1);
                }
                max=Math.max(max, sum);
            }



            return max;
    }
}
