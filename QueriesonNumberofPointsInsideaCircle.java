public class QueriesonNumberofPointsInsideaCircle {
    public static void main(String[] args) {
        
    }
    public int[] countPoints(int[][] points, int[][] queries) {
        int[] ans=new int[queries.length];
        int x=0;
        for (int[] query : queries) {
            int res=0;
            for (int[] point : points) {
                if(query[2]*query[2] <= ((query[0] - point[0])*(query[0] - point[0]) + (query[1] - point[1])*(query[1] - point[1]))){
                    res++;
                }
            }
            ans[x]=res;
            x++;
        }
        return ans;
    }
}
