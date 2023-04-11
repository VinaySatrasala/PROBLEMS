public class FindNeaarestXY {
    public static void main(String[] args) {
        
    }
    public int nearestValidPoint(int x, int y, int[][] points) {
        int index=-1;
        int val=Integer.MAX_VALUE;
        int i=0;
        for (int[] is : points) {
            if(is[0] == x || is[1] == y){
                int current = Math.abs(is[0]-x)+Math.abs(is[1] - y);
                if(current<val){
                    index = i;
                    val = current;
                }
            }
            i++;
        }
        
        
        return -1;

    }
}
