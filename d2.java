import java.util.Arrays;

public class d2 {
    public static void main(String[] args) {
        String k="22098989";
        int[] count=new int[10];

        for(char i:k.toCharArray()){
            count[i-'0']++;
        }


        System.out.println(Arrays.toString(count));
    }
}
