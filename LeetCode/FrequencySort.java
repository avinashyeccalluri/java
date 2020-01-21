import java.util.Arrays;

/**
 * FrequencySort
 */
public class FrequencySort {

    public static void main(String[] args) {
        System.out.println(frequencySort("avinash"));
    }
    public static String frequencySort(String s) {
        char[] a=s.toCharArray();
        String result="";
        Arrays.sort(a);
        for(int i=a.length-1;i>=0;i--){
            result+=a[i];
        }return result;
    }
}