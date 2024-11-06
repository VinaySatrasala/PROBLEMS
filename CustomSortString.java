public class CustomSortString {
    public static void main(String[] args) {
        System.out.println(customSortString("cba", "abcd"));
    }
    public static String customSortString(String order, String s) {
        int[] freq = new int[26];
        for(int i = 0 ;i<s.length();i++){
            char ch = s.charAt(i);
            freq[ch - 'a']++;
        }
        String ans = "";
        for(int i=0;i<order.length();i++){
            char ch = order.charAt(i);
            String temp = (ch+"").repeat(freq[ch - 'a']);
            ans = ans + temp;
            s = s.replaceAll(ch+"", "");
        }
        return ans + s;
    }
}
