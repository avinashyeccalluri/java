/**
 * Test
 */
import java.util.*;
public class Test {

    public static void main(String[] args) {
        int[] a={10,2,1};
        System.out.println(sumArray(a));
    }
    static  int sumArray(int[] someArray) {
        int sum=0;
        Arrays.sort(someArray);
        ArrayList<Integer> ac=new ArrayList<>();
        for(int i=someArray.length-1;i>=1;i--){
            ac.add(someArray[i]-someArray[i-1]);
        }
        for(int i:ac){
            sum+=i;
        }
        return sum;
    }
}