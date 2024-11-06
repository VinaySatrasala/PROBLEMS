public class NthDigit {
    public static void main(String[] args) {

    }
    public int findNthDigit(int n) {
        if(n<=9){
            return n;
        }
        long p10=1;
        int dig=0;
        for(int i=1;i<=10;i++){
            long x=9*i*p10;
            if(n<=x){
                int p=n/i;
                String s=p10+p+"";
                if(n%i == 0){
                    long res=p10+p-1;
                    dig=(int)res%10;
                }else{
                    dig=s.charAt(n%i-1)-'0';
                }
                break;
            }
            p10*=10;
            n-=x;
        }
        return dig;
    }
}
