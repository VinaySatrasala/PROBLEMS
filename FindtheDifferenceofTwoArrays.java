import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindtheDifferenceofTwoArrays {
    public static void main(String[] args) {
        
    }
    static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer> res1=new ArrayList<>();
        List<Integer> res2=new ArrayList<>();

        for(int i:nums1){
            if(!res1.contains(i)){
                res1.add(i);
            }
        }
        for(int i:nums2){
            if(!res2.contains(i)){
                res2.add(i);
            }
        }

        List<Integer> l1=new ArrayList<>();
        for(int i=0;i<res1.size();i++){
            if(!res2.contains(res1.get((Integer)i))){
                l1.add(res1.get((Integer)(i)));
            }
        }
        List<Integer> l2=new ArrayList<>();
        for(int i=0;i<res2.size();i++){
            if(!res1.contains(res2.get((Integer)i))){
                l1.add(res2.get((Integer)(i)));
            }
        }
        List<List<Integer>> ans=new ArrayList<>();
        ans.add(l1);
        ans.add(l2);
        return ans;
    }
}
