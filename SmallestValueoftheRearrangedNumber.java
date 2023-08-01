import java.util.Arrays;

public class SmallestValueoftheRearrangedNumber {
    public static void main(String[] args) {
        System.out.println(smallestNumber(3100));
    }
    static long smallestNumber(long num) {
        if(num == 0){
            return num; 
        }
        char[] ch = (Math.abs(num)+"").toCharArray();
        boolean negative = num<0;
        Arrays.sort(ch);
        String str = new String(ch);
        if(!negative&&str.contains("0")){
            int index = str.length() - str.replaceAll("0","").length();
            char temp = ch[0];
            ch[0] = ch[index];
            ch[index] = temp;
            str = new String(ch);
        }
        if(!negative){
            return Long.parseLong(str);
        }

        StringBuilder s = new StringBuilder(str);
        str = s.reverse().toString();

        return Long.parseLong(str);
    }
}
