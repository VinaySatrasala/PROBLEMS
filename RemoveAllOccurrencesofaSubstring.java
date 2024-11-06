import java.util.Stack;

public class RemoveAllOccurrencesofaSubstring {
    public static String removeOccurrences(String s, String part) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
            if(!stack.empty() && stack.size() >= part.length() && stack.peek() == part.charAt(part.length() - 1)){
                int n = part.length();
                while(n-- > 0){
                    stack.pop();
                }
            }
        }
        String ans = "";
        while(!stack.empty()){
            ans = stack.pop() + ans;
        }

        return ans;
    }


    public static void main(String[] args) {
        System.out.println(removeOccurrences("aabababa", "aba"));
    }
}
