import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] a={4,1,2};
        int[] temp={1,3,4,2};
        System.out.println(Arrays.toString(nextGreaterElement(a, temp)));;
    }
    static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer> a=new HashMap<>();
        for(int i=0;i<nums2.length;i++){
            a.put(nums2[i],i);
        }
        for (int i = 0; i < nums1.length; i++) {
            int index=-1;
            for (int j = a.get(nums1[i])+1; j < nums2.length; j++) {
                if(nums2[j] > nums1[i]){
                    index = nums2[j];
                    break;
                }
            }
            nums1[i] =index;
        }
        return nums1;
    }

    /*Map<Integer,Integer> an1=new HashMap<>();
        Map<Integer,Integer> an2=new HashMap<>();
        int[] temp=nums2;
        for(int i=0;i<nums2.length;i++){
            an1.put(nums2[i],i);
        }
        Arrays.sort(temp);
        for(int i=0;i<temp.length;i++){
            an2.put(temp[i],i);
        }
        for (int i = 0; i < nums1.length; i++) {
            int act=an2.get(nums1[i]);
            if(act == nums2.length){
                nums1[i]=-1;
            }else{
                nums1[i] = an1.get(++act);
            }
        }
        return nums1; */
}
