public class ReversePrefixofWord {
    public static void main(String[] args) {
        System.out.println(reversePrefix("abcdefd", 'd'));
    }
    static String reversePrefix(String word, char ch) {
        int index = word.indexOf(""+ch);
        String sub = word.substring(0, index+1);
        StringBuilder str = new StringBuilder(sub);
        return str.reverse().toString() + word.substring(index+1);
    }
}
