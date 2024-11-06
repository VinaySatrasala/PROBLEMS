public class MinimumFlipsToMakeAorBisC {
    public static void main(String[] args) {
        System.out.println(minFlips(1, 2, 3));
    }

    static int minFlips(int a, int b, int c) {
        int count = 0;
        while (a > 0 || b > 0 || c > 0) {
            int last_a = a & 1;
            int last_b = b & 1;
            int last_c = c & 1;

            int def = 1;
            if ((last_a | last_b) != last_c) {
                if(last_a == 1 && last_b == 1){
                    def = 2;
                }
                count +=def;
            }

            a = a >> 1;
            b = b >> 1;
            c = c >> 1;
        }
        return count;
    }
}
