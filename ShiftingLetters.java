import java.util.Arrays;

public class ShiftingLetters {
    public static void main(String[] args) {
        System.out.println(shiftingLetters("bad", new int[]{10,20,30}));
        // System.out.println('l' - 'b');
    }
    static String shiftingLetters(String s, int[] shifts) {
        char[] ans=s.toCharArray();
        for (int i = 0; i < shifts.length; i++) {
            for (int j = 0; j <=i; j++) {
                int rem= ((ans[j]-'a') +shifts[i])%25;
                ans[j] = (char)('a'+rem);
            }
            System.out.println(Arrays.toString(ans));
        }
        
        return new String(ans);   

    }
}
