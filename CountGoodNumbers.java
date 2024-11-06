public class CountGoodNumbers {
    public static void main(String[] args) {
        System.out.println(countGoodNumbers(50));
        long x=1220703125;
    }
    static int countGoodNumbers(long n) {
        long odd=n/2;
        long even=n-odd;
        int mod=1000000007;
        long pow5=power(5, even);
        long pow4=power(4, odd);
        System.out.println(pow5);
        System.out.println(pow4);
        if(odd==0){
            return (int)pow5;
        }

        return (int)((pow5%mod)*(pow4%mod))%mod;
        
    }
    static long power(long x,long y){
        long temp;
        int mod=1000000007;
        if(y==0) return 1;
        temp=power(x,y/2);
        if(y%2==0) return (temp*temp)%mod; 
        else return (x*temp*temp)%mod;
    }
}
