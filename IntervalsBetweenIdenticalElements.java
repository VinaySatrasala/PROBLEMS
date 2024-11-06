import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntervalsBetweenIdenticalElements {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getDistances(new int[]{2,1,3,1,2,3,3})));
    }
    static long[] getDistances(int[] arr) {
        long[] ans=new long[arr.length];
        Map<Integer,List<Integer>> m=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(!m.containsKey(arr[i])){
                List<Integer> mm=new ArrayList<>();
                mm.add(i);
                m.put(arr[i],mm);
            }else{
                m.get(arr[i]).add(i);
            }
        }

        for (int i = 0; i < ans.length; i++) {
            for (Integer l : m.get(arr[i])) {
                ans[i]+=(long)Math.abs(i-l);
            }

        }
        return ans;
    }
}
