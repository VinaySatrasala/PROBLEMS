import java.util.Arrays;

public class SimplifyPath {
    public static void main(String[] args) {
        String str="/../mall//kk//mal//";
        String[] spl=str.split("//");
        System.out.println(Arrays.toString(spl));
        // System.out.println(simplifyPath(str));
    }
    static String simplifyPath(String path) {
        String[] spl=path.split("//");
        System.out.println(Arrays.toString(spl));
        System.out.println(spl[0] == "");
        StringBuilder st=new StringBuilder();
        int i=0;
        while(i<spl.length){
            if(spl[i].equals("") && i<spl.length-1 && spl[i+1].equals("")){
                st.append("/");
                i++;
            }else if(i == spl.length-1 && spl[i].equals("")){
                break;
            }else if(spl[i].equals("") && !spl[i+1].equals("")){
                st.append("/");
            }else{
                st.append(spl[i]);
            }
            i++;
        }
        
        System.out.println(st.toString());
        return "";

    }
}
