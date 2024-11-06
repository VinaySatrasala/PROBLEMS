import java.util.ArrayList;
import java.util.List;

public class FindKClosestElements {
    public static void main(String[] args) {
        int[] arr = {1,3};
        System.out.println(findClosestElements(arr, 1, 2));
    }

    static List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> ans = new ArrayList<>();
        int s = bs(arr, x);
        ans.add(0, arr[s]);
        int e = s + 1;
        s--;
        k--;
        while (k > 0) {
            if (e == arr.length && k > 0) {
                while (k > 0 && s > -1) {
                    ans.add(0, arr[s--]);
                    k--;
                }
            }
            if (s == -1 && k > 0) {
                while (k > 0 && e < arr.length) {
                    ans.add(arr[e++]);
                    k--;
                }
            }

            if (k > 0) {
                if (e < arr.length && Math.abs(x - arr[s]) <= Math.abs(x - arr[e]) && s > -1) {
                    ans.add(0, arr[s--]);
                    k--;
                } else {
                    if (e < arr.length) {
                        ans.add(arr[e++]);
                        k--;
                    }
                }
            }
        }
        return ans;

    }

    static int bs(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;

        while (s <= e) {
            int m = s + (e - s) / 2;
            if (arr[m] == target) {
                return m;
            } else if (arr[m] > target) {
                e = m - 1;
            } else {
                s = m + 1;
            }
        }
        if(s == arr.length || e == -1){
            return s;
        }
        if(e == -1 || Math.abs(target - arr[e]) < Math.abs(target - arr[s])){
            System.out.println(s);
            return s;
        }
        System.out.println(e);
        return e;
    }
}
