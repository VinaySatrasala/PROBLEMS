import java.util.ArrayList;
import java.util.List;

public class LetterCasePermutation {
    public static void main(String[] args) {
        System.out.println(letterCasePermutation("3z4"));
    }
    static List<String> letterCasePermutation(String s) {
        List<String> ans = new ArrayList<>();
        fun(s, ans, 0);
        return ans;
    }

    static void fun(String up,List<String> ans,int pointer){
        if(pointer == up.length()){
            ans.add(up);
            return;
        }

        char present = up.charAt(pointer);
        
        if(!(present-'0'<=9 && present-'0'>=0)){
            fun(up, ans, pointer+1);
            up = up.substring(0, pointer) + (char)(present^32) + up.substring(pointer+1);
            fun(up, ans, pointer+1);
        }else{
            fun(up, ans, pointer+1);
        }
    }
}
