public class LongestPalindromicSubsequence {
    public static void main(String[] args) {
        
    }
    public int longestPalindromeSubseq(String s) {
        int max = 1;
        for(int i=0;i<s.length();i++){
            if(max > s.length()/2){
                break;
            }
            for(int j=i+1;j<s.length();j++){
                String cur=s.substring(i, j);
                if(!isPoly(cur)){
                    break;
                }else{
                    if(max < (i-j+1)){
                        max = i-j+1;
                    }
                }
            }
        }
        
        return max;
    }
    static boolean isPoly(String s){
        StringBuilder str=new StringBuilder(s);
        return s.equals(str.reverse().toString());

    }
}
