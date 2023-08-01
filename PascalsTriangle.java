import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        System.out.println(generate(30));   
    }
    static List<List<Integer>> generate(int n) {
        List<List<Integer>> ans = new ArrayList<>();


        ans.add(new ArrayList<>());
        ans.get(0).add(1);

        for (int i = 2; i <= n; i++) {
            List<Integer> temo = new ArrayList<>();
            temo.add(1);
            for(int j = 1;j<ans.get(i - 2).size();j++){
                temo.add(ans.get(i - 2).get(j) + ans.get(i - 2).get(j - 1));
            }
            temo.add(1);
            ans.add(temo);
        }




        return ans;
    }
}
