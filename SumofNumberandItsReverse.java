import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SumofNumberandItsReverse {
    public static void main(String[] args) {
        System.err.println(sumOfNumberAndReverse(63));;
    }
    static boolean sumOfNumberAndReverse(int num) {
        List<Integer> sums=new ArrayList<>();

        for(int i=num/2;i<num;i++){
            sums.add(i);
        }
        for(int i=num/2;i<num;i++){
            if(sums.contains(num - i)){
                StringBuilder str=new StringBuilder(sums.get(num - i));
                if((i+"").equals(str.reverse().toString())){
                    return true;
                }
            }
        }
        return false;   
    }
    // static int rev(int n){
    //     int ans=0;
    //     while(n>0){
    //         ans += n%10;
    //         n=n/10;
    //     }
    //     return ans;
    // }
}
