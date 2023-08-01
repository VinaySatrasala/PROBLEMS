import java.util.ArrayList;
import java.util.List;

public class Combinations {
    public static void main(String[] args) {
        System.out.println(combine(4, 2));
    }
    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        help(ans,new ArrayList<>(),k,1,n);
        return ans;
    }
    public static void help(List<List<Integer>> ans,List<Integer> temp,int k,int start,int n){
        if(temp.size() == k){
            System.out.println(temp);
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(start > n ){
            return;
        }

        temp.add(start);
        int sz = temp.size() - 1;
        help(ans,temp,k, start + 1 ,n);
        temp.remove(sz);
        help(ans,temp,k,start + 1,n);

    }   
}
