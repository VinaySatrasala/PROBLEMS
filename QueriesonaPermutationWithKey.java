import java.util.ArrayList;
import java.util.List;

public class QueriesonaPermutationWithKey {
    public static void main(String[] args) {
        List<Integer> temp= new ArrayList<>();

        temp.add(1);
        temp.add(2);
        temp.add(3);
        temp.remove((Integer)2);
        temp.add(0, 2);
        System.out.println(temp);
    }
    public int[] processQueries(int[] queries, int m) {
        int[] res=new int[queries.length];

        List<Integer> temp= new ArrayList<>();

        for(int i=1;i<=m;i++){
            temp.add(i);
        }

        for(int i=0;i<queries.length;i++){
            res[i] = temp.indexOf((Integer)queries[i]);
            int t = res[i];
            temp.remove((Integer)t);
            temp.add(0, t);
        }

        return res;
    }
}
