public class NeighboringBitwiseXOR {
    public static void main(String[] args) {
        
    }
    static boolean doesValidArrayExist(int[] derived) {
        int x = 0;
        for(int i:derived){
            x^=i;
        }

        return x == 0;
    }
}
