import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertanArrayIna2DArrayWithConditions {
    public static void main(String[] args) {
        
    }
    static List<List<Integer>> findMatrix(int[] nums) {
        // Arrays.fill();
        List<List<Integer>> ans=new ArrayList<>();
        ans.add(new ArrayList<Integer>());
        for(int i:nums){
            boolean found=false;
            for(int k=0;k<ans.size();k++){
                if(!ans.get(i).contains(i)){
                    ans.get(i).add(i);
                    found=true;
                    break;
                }
            }

            if(!found){
                List<Integer> temp=new ArrayList<>();
                temp.add(i);
                ans.add(temp);
            }
        }


        return ans;
    }
}
