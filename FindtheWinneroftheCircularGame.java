public class FindtheWinneroftheCircularGame {
    public static void main(String[] args) {
        
    }
    public int findTheWinner(int n, int k) {
        int i=0;
        boolean[] res=new boolean[n];
        int false_count=0;
        while(true){
            if(!res[i+k]){
                res[i+k] = true;
                false_count++;
            }
            
            if(false_count == n-1){
                break;
            }

        }


        
        
        return 0;

    }
}
