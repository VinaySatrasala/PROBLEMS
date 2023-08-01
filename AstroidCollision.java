import java.util.Arrays;

public class AstroidCollision {
    public static void main(String[] args) {
        int[] res={10,2,-5,5,3,-5};
        asteroidCollision(res);
    }

    static int[] asteroidCollision(int[] a) {
        // int i=0;
        // int j=1;
        boolean ncompleted=true;

        int c=0;
        for(int i=0;i<a.length;i++){
            int k=0;
            for(int j=1;j<a.length;j++){
                if(a[j] > 0 && a[k] < 0){
                    if(a[j] > (0-a[k])){
                        a[k] = 0;
                        c++;
                        k = j;
                    }else if(a[j] == (0-a[k])){
                        a[j]=0;
                        a[k]=0;
                        c+=2;
                    }else{
                        a[j] = 0;
                        c++;
                    }
                }else if(a[j] < 0 && a[k] >0 ){
                    if(a[k]> (0-a[j])){
                        a[j] = 0;
                        c++;
                    }else if(a[k] == (0-a[j])){
                        a[j]=0;
                        a[k]=0;
                        c+=2;
                    }else{
                        a[k] = 0;
                        k = j;
                        c++;
                    }
                }

                // Math.log10(j)

                if((a[j] < 0 && a[k] < 0 ) || (a[j] > 0 && a[k] > 0)){
                    k=j;
                }
            }


            
        }

        int[] res=new int[c];
        int p=0;
        for(int i:a){
            if(i > 0){
                res[p] = i;
                p++;
            }
        }

        System.out.println(Arrays.toString(a));

        return res;
    }
}
