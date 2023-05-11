public class FindtheWinnerofanArrayGame {
    public static void main(String[] args) {
        
    }
    public int getWinner(int[] arr, int k) {
        int current=arr[0];
        int count = 0;
        for(int i=1;i<arr.length;i++){
            if(current > arr[i]){
                if(++count == k){
                    return current;
                }
            }else{
                current = arr[i];
                count =1;
            }
        }
        
        
        
        return current;   

    }
}
