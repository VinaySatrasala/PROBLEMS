public class MinimumNumberofStepstoMakeStringsAnagram {
    public static void main(String[] args) {
        
    }
    static int minSteps(String s, String t) {
        int[] fs = new int[26];
        int[] ft = new int[26];


        for(int i = 0;i<s.length();i++){
            fs[s.charAt(i) - 'a']++;
            ft[t.charAt(i) - 'a']++;
        }

        int freq = 0;
        for (int i = 0; i < ft.length; i++) {
            if(fs[i] > ft[i]){
                freq+=(fs[i] - ft[i]);
            }
        }
        
        
        return freq;

    }
}
