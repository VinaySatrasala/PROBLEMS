import java.util.Stack;

public class P1190 {
    public static void main(String[] args) {
        System.out.println(true || false);
    }
    static int s = 10;
    public static String reverseParentheses(String s) {
        Stack<Character> st = new Stack<>();

        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == '('){
                st.add('(');
                continue;
            }

            String popoped = "";
            if(s.charAt(i) == ')'){
                while(!st.isEmpty() && st.peek() != '('){
                    popoped += st.pop();
                }
            }

            st.pop();
            if(i == s.length() -1){
                return popoped;
            }
            while(popoped.isEmpty()){
                st.push(popoped.charAt(0));
            }
        }


        return "";
    }
}
