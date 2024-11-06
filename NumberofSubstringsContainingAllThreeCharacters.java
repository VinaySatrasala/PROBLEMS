public class NumberofSubstringsContainingAllThreeCharacters {
    public static void main(String[] args) {
        
    }
    static int numberOfSubstrings(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                boolean check = s.substring(i, j).contains("a") && s.substring(i, j).contains("b") && s.substring(i, j).contains("c");
                if(check){
                    count++;
                }
            }
        }

        return count;
    }
}
