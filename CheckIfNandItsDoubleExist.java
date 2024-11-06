import java.util.ArrayList;
import java.util.List;

public class CheckIfNandItsDoubleExist {
    public static void main(String[] args) {
        int[] arr = {-20,8,-6,-14,0,-19,14,4};
        System.out.println(checkIfExist(arr));
    }   
    static boolean checkIfExist(int[] arr) {

        List<Integer> doubles = new ArrayList<>();
        List<Integer> singles = new ArrayList<>();
        int zeros = 0 ;
        for(int i : arr){
            singles.add(i);
            if(i == 0){
                zeros++;
                if(zeros > 1){
                    return true;
                }
            }
            else if((i & 1) == 0){
                doubles.add(i);
                if(singles.contains((Integer)(i / 2)) || doubles.contains((Integer)i*2)){
                    System.out.println(i);
                    return true;
                }
            }else{
                if(doubles.contains((Integer)(i*2))){
                    return true;
                }
            }
        }

        return false;
    } 
}
