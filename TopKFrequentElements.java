import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TopKFrequentElements {
    public static void main(String[] args) {
        // topKFrequent(, 2);
        System.out.println(Arrays.toString(topKFrequent(new int[]{1,1,1,2,2,3,2,3}, 2)));
    }
    static int[] topKFrequent(int[] nums, int k) {
        List<Integer> keys=new ArrayList<>();
        List<Integer> values=new ArrayList<>();

        for(int i:nums){
            if(!keys.contains(i)){
                keys.add(i);
                values.add(1);
            }else{
                values.set(keys.indexOf((Integer)i), values.get(keys.indexOf((Integer)i))+1);
            }
        }
        
        int[] ans=new int[k];
        for(int i=0;i<ans.length;i++){
            int max = 0;
            int index=-1;
            for(int j=0;j<values.size();j++){
                if(max < (int)values.get(j)){
                    max = (int)values.get(j);
                    index = j;
                }
            }
            if(index != -1){
                ans[i] = keys.get(index);
                values.set(index,0);
            }
        }
        return ans;
    }
}
