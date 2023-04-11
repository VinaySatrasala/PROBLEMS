public class DecodeXORedPermutation {
    public static void main(String[] args) {
        
    }
    static int[] decode(int[] encoded) {
        int x= FindXor(encoded.length+1);
        int[] perms=new int[encoded.length+1];
        for (int i = 0; i < encoded.length-1; i++) {
            perms[perms.length-1]^=encoded[i];
        }
        perms[perms.length-1]^=x;

        int k=encoded.length-1;
        for (int i = perms.length-2; i >=0; i--) {
            perms[i] = perms[i+1]^encoded[k];
            k--;
        }

        return perms;
    }
    static int FindXor(int x){
        if(x % 4 == 0){
            return x;
        }else if(x%4 ==1){
            return 1;
        }else if(x%4 == 2){
            return x+1;
        }
        
        return 0;

    }
}
