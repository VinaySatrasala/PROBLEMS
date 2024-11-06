import java.util.Arrays;

public class ShiftingLettersII {
    public static void main(String[] args) {
        int[][] k= {{0,4,0},{0,2,1},{1,3,1},{0,4,1},{4,4,1},{2,3,0},{5,5,0},{3,3,0},{2,3,0},{5,5,1},{5,5,1},{5,5,0}};
        System.out.println(shiftingLetters("iaozjb", k));
        // System.out.println((int)'^');
    }
    static String shiftingLetters(String s, int[][] shifts) {
        char[] ch = s.toCharArray();
        int[] count = new int[s.length()+1];
        
        for(int[] shift : shifts){
            int value = shift[2] == 1 ? 1 : -1;
            count[shift[0]] += value;
            count[shift[1] + 1] -= value;
        }
        System.out.println(Arrays.toString(count));
        int sum = 0;
        for(int i = 0; i < count.length - 1; i++){
            sum += count[i];
            int newChar = ((ch[i] - 'a') + sum) % 26;
            if(newChar < 0) newChar+= 26;
            ch[i] =  (char)('a' + newChar);
        }
        
        return String.valueOf(ch);
    }
    static String shiftingetters(String s, int[][] shifts) {
        // StringBuilder str=new StringBuilder(s);
        char[] ch=s.toCharArray();
        for (int[] is : shifts) {
            int left=is[0];
            int right=is[1];
            int forw=is[2]==0?-1:1;
            for(int i=left;i<right;i++){
                ch[i]=(char)(((ch[i] - 'a') + forw)%26 +'a');
            }
        }
        return new String(ch);

    }
}
