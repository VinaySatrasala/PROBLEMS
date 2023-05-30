import java.util.ArrayList;
import java.util.List;

public class WordSubsets {
    public static void main(String[] args) {
        
    }
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> ans = new ArrayList<>();

        for(String uni:words1){

            boolean con = true;
            for (String sub : words2) {
                if(!uni.contains(sub)){
                    con = false;
                    break;
                }
            }

            if(con){
                ans.add(uni);
            }
        }

        return ans;
    }
}
