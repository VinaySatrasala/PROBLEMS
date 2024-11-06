import java.util.ArrayList;
import java.util.List;

public class pp {
    public static void main(String[] args) {
        String str = "abc";

        List<String> substrings = generateSubstrings(str);
        for (String substring : substrings) {
            System.out.println(substring);
        }
    }

    public static List<String> generateSubstrings(String str) {
        List<String> substrings = new ArrayList<>();

        generateSubstringsHelper(str, 0, "", substrings);

        return substrings;
    }

    public static void generateSubstringsHelper(String str, int index, String currentSubstring, List<String> substrings) {
        if (index == str.length()) {
            return;
        }

        for (int i = index; i < str.length(); i++) {
            String substring = currentSubstring + str.charAt(i);
            substrings.add(substring);
            generateSubstringsHelper(str, i + 1, substring, substrings);
        }
    }
}
