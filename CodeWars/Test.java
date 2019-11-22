import java.util.*;
public class Test {

    public static void main(String[] args) {
        int[] a={0,1,3,6,10};
        System.out.println(sumParts(a));
    }
    public static int[] sumParts(int[] ls) {
        int sum=0;
        int[] addedValues=new int[ls.length];
        for(int i=0;i<ls.length;i++){
            for(int j=i;j<ls.length;j++){
                sum+=ls[j];
            }
            addedValues[i]=sum;
        }

        return null;
    }
    
}