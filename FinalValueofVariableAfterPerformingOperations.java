public class FinalValueofVariableAfterPerformingOperations {
    public static void main(String[] args) {
        System.out.println(finalValueAfterOperations(new String[]{"+","-","+"}));
    }
    static int finalValueAfterOperations(String[] operations) {
        int ans=0;
        for (String string : operations) {
            if(string.contains("+")){
                ans++;
            }else{
                ans--;
            }
        }
        return ans;

    }
}
