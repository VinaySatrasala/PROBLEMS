import java.util.HashMap;
import java.util.Map;

public class NumberofWaysWhereSquareofNumberIsEqualtoProductofTwoNumbers {
    public static void main(String[] args) {
        int[] nums1 = {1,1};
        int[] nums2={1,1,1,1};
        System.out.println(numTriplets(nums1, nums2));
    }
    static int numTriplets(int[] nums1, int[] nums2) {

        Map<Integer,Integer> n1=new HashMap<>();
        Map<Integer,Integer> n2=new HashMap<>();
        for(int i:nums1){
            if(n1.containsKey(i*i)){
                n1.replace(i*i, n1.get(i*i)+1);
            }else{
                n1.put(i*i,1);
            }
        }

        for(int i:nums2){
            if(n2.containsKey(i*i)){
                n2.replace(i*i, n2.get(i*i)+1);
            }else{
                n2.put(i*i,1);
            }
        }
        int pairs=0;

        for(int i=0;i<nums1.length;i++){
            for(int j=i+1;j<nums1.length;j++){
                if(n2.containsKey(nums1[i] * nums2[j])){
                    int x = n2.get(nums1[i] * nums1[j]);
                    // System.out.println(x);
                    pairs+=x;
                }
            }
        }

        for(int i=0;i<nums2.length;i++){
            for(int j=i+1;j<nums2.length;j++){
                if(n1.containsKey(nums2[i] * nums2[j])){
                    int x = n1.get(nums2[i] * nums2[j]);
                    // System.out.println(x);
                    pairs+=x;
                }
            }
        }
        System.out.println(pairs);
        return pairs;

    }
}
