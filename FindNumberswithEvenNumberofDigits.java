public class FindNumberswithEvenNumberofDigits {
    public static void main(String[] args) {
        int[] nums={12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }
    static int findNumbers(int[] nums) {
        int count=0;
        for(int i:nums){
            System.out.println(Math.log10(i));
            if(((int)Math.log10(i)+1) % 2 == 0){
                count++;
            } 
        }
        
        
        return count;
    }
}
