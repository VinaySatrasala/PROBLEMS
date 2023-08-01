public class KthDistinctStringinanArray {
    public static void main(String[] args) {
        String[] arr = {"a" , "b" , "a"};
        System.out.println(kthDistinct(arr, 2));

    }
    static String kthDistinct(String[] arr, int k) {
        String str = "";
        String dubs = "";
        for(String s : arr){
            if(str.contains(s)){
                str = str.replaceAll(s, "");
                dubs+=s;
            }else if(!dubs.contains(s)){
                str+=s;
            }
            // System.out.println(str);
        }

        return str.charAt(k-1)+"";
    }
}
