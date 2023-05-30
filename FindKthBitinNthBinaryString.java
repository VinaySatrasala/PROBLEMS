public class FindKthBitinNthBinaryString {
    public static void main(String[] args) {
        String s="01";
        // System.out.println(s.replace('0', '2').replace('1', '0').replace('2', '1'));
        System.out.println(s);
        s.
    }

    static char f(String s,int suf,int n,int k){
        if(suf == n){
            return s.charAt(k-1);
        }

        String inverted=s.replace('0', '2').replace('1', '0').replace('2', '1');

        StringBuilder str=new StringBuilder(inverted);
        
        String rev=str.reverse().toString();
        
        String t=s+"1"+rev;
        return f(t, ++suf, n, k);
    }
}
