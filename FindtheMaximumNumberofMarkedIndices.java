import java.util.Arrays;

public class FindtheMaximumNumberofMarkedIndices {
    public static void main(String[] args) {
        System.out.println(maxNumOfMarkedIndices(new int[]{3,5,2,4}));
        // for (int i = 0; i < 10; i++) {
        //     if(i==7) continue;
        //     System.out.println(i);
        //     for (int j = 0; j < 2; j++) {
        //         System.out.println("hi");
        //     }
        // }
    }
    static int maxNumOfMarkedIndices(int[] nums) {
        boolean[] res=new boolean[nums.length];
        int count=0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if(res[i]){
                continue;
            }
            for (int j = i+1; j < nums.length; j++) {
                if(!res[j]){
                    if(2*nums[i] <=nums[j] || 2*nums[j] <=nums[i]){
                        res[i] = true;
                        res[j] = true;
                        count+=2;
                    }
                }
            }
        }
        
        
        return count;

    }
}
