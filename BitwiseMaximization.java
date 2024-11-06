public class BitwiseMaximization {
    public static int findMaximizedX(int a) {
        if (a == 0) {
            return 0;
        }
        
        int msbPosition = 0;  // Most significant bit position
        
        // Find the most significant bit position of a
        while (a > 0) {
            a = a >> 1;
            msbPosition++;
        }
        
        // Set all bits from the most significant bit position to 1
        int x = (1 << msbPosition) - 1;
        
        return x;
    }
    
    public static void main(String[] args) {
        int a = 10;
        int maximizedX = findMaximizedX(a);
        System.out.println(maximizedX^a);
    }
}
