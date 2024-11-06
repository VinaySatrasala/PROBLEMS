import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sum3 {
    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{0,0,0}));
    }
    static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        solver(nums, 0, 0, ans, new ArrayList<>());
        return ans;
    }

    static void solver(int[] c , int pointer,int sum,List<List<Integer>> ans,List<Integer> temp){
        if(temp.size() != 0 && sum == 0 && temp.size() == 3){
            List<Integer> t = new ArrayList<>(temp);
            Collections.sort(t);
            if(!ans.contains(t)){
                ans.add(t);
            }
            return;
        }
        if(pointer == c.length){
            return;
        }

        if(temp.size() > 3){
            return;
        }


        temp.add(c[pointer]);
        solver(c, pointer + 1, sum + c[pointer], ans, temp);
        temp.remove(temp.size() - 1);



        solver(c, pointer + 1, sum, ans, temp);
    }
}
