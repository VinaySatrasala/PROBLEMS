public class SortIntegersbyThePowerValue {
    public static void main(String[] args) {
        System.out.println(getKth(0, 0, 0));
    }
    static int getKth(int lo, int hi, int k) {  
        int[] res1=new int[hi-lo];
        int[] res2=new int[hi-lo];
        for(int i=lo;i<=hi;i++){
            int t=i;
            int ops=0;
            while(t>1){
                if((t&1) == 0){
                    t/=2;
                }else{
                    t = 3*t + 1;
                }
                res1[1]++;
            }
        }
        
        for(int i=0;i<res1.length;i++){
            for (int j = i; j < res2.length; j++) {
                
            }
        }

        return 0;

    }
}
