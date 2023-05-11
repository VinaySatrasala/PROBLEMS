import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubdomainVisitCount {
    public static void main(String[] args) {
        
    }
    public List<String> subdomainVisits(String[] cpdomains) {
        List<String> ans=new ArrayList<>();

        Map<String,Integer> res=new HashMap<>();


        for(String i:cpdomains){
            ans.add(i);
            String[] str=i.split(" ");
            String[] str2=str[1].split(".");
            for (String j : str2) {
                str[0].replaceAll(j+".", "");
                if(res.containsKey(str[0])){
                    
                }
            }


        }

        return ans;
           
    }
}
