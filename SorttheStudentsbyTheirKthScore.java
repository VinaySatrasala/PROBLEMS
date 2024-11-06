import java.util.Arrays;

public class SorttheStudentsbyTheirKthScore {
    public static void main(String[] args) {
        int[][] score={{10,6,9,1},{7,5,11,2},{4,8,3,15}};
        int k = 2;

        sortTheStudents(score, k);

        for(int[] i:score){
            // System.out.println(Arrays.toString(i));
        }
    }
    static void sortTheStudents(int[][] score, int k) {
        for(int i=0;i<score.length;i++){
            int max=-1;
            int index=-1;
            for(int j=i;j<score.length;j++){
                if(score[j][k] > max){
                    max=score[j][k];
                    index=j;
                }
            }

            System.out.println(max);
            System.out.println(index);

            for(int t=0;t<score[0].length;t++){
                int temp=score[i][t];
                score[i][t] = score[index][t];
                score[index][t] = temp;
            }

            System.out.println(Arrays.toString(score[i]));
        }

        // return score;
    }
}
