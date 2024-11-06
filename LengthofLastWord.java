public class LengthofLastWord {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
    }
    static int lengthOfLastWord(String s) {
        StringBuilder str=new StringBuilder(s.trim());
        str.length();
        System.out.println(str.reverse().toString());
        System.out.println(str.indexOf(" "));
        
        return 0;  

    }
}
