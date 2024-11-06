import java.util.Arrays;

public class AddingNegaBinaryNumbers {
    public static void main(String[] args) {
        int[] arr1={0};
        int[] arr2={1,0};
        System.out.println(Arrays.toString(addNegabinary(arr1, arr2)));
    }
    static int[] addNegabinary(int[] arr1, int[] arr2) {
        int base=1;
        int f=0;
        for(int i=arr1.length-1;i>=0;i--){
            f+=(arr1[i]*base);
            base*=(-2);
        }
        base =1;
        int s=0;
        for(int i=arr2.length-1;i>=0;i--){
            s+=(arr2[i]*base);
            base*=(-2);
        }  
        int res=f+s;
        int[] ans=new int[Math.max(arr1.length,arr2.length)];
        for(int i=ans.length-1;i>=0;i--){
            ans[i] = res%-2;
            res=res/-2;
        }

        return ans;
    }
}
