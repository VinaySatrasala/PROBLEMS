import java.util.ArrayList;
import java.util.List;

public class OptimalPartitionofString {
    public static int partitionString(String s) {
        List<String> list = new ArrayList<>();
        String ans = "";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ans.contains(ch+"")){
                list.add(ans);
                ans = "";
            }
            ans = ans + ch;
        }
        list.add(ans);
        System.out.println(list);


        return list.size();
    }
    public static void main(String[] args) {
        System.out.println(partitionString("abacaba"));
    }
}
