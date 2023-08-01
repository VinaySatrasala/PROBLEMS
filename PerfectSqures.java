public class PerfectSqures {
    public static void main(String[] args) {
        helper(0, 7168,"");
        System.out.println(min_ops);
    }
    static int min_ops = Integer.MAX_VALUE;
    static void helper(int ops,int n,String path){
        if(n == 0){
            if(ops < min_ops){
                min_ops = ops;
                System.out.println(path);
            }
            return;
        }

        if(ops > min_ops){
            return;
        }
        int n_root = (int)Math.sqrt(n);
        for (int i = n_root; i*i <= n ; i--) {
            if(n - i*i >= 0){
                helper(ops+1 , n - i*i,path+(i*i));
            }
        }
    }   
}
