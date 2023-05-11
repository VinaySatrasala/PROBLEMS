public class NumberofTimesBinaryStringIsPrefixAligned {
    public static void main(String[] args) {
        int[] flips = {1,2,3,4,5,6,18,8,30,10,11,12,13,14,17,16,15,7,19,20,41,22,23,24,33,26,27,25,29,9,31,32,28,34,35,36,37,38,39,40,21,42};
        System.out.println(numTimesAllBlue(flips));
    }
    static int numTimesAllBlue(int[] flips) {
        int count = 0;
        int[] ch=new int[flips.length];
        for(int i = 1; i<=flips.length;i++){
            ch[flips[i-1]-1] = 1;
            boolean prefix = true;
            for(int x =1;x<=i;x++){
                if(ch[x-1] != 1){
                    prefix = false;
                    break;
                }
            }
            if(prefix){
                count++;
            }
        }
        return count;   
    }
}
