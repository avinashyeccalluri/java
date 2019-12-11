import java.util.Arrays;
import java.util.stream.IntStream;
/**
 * Test
 */
public class Twosort {

    public static void main(final String[] args) {
        // {"bitcoin", "take", "over", "the", "world", "maybe", "who", "knows", "perhaps"}
        String[] a={"turns", "out", "random", "test", "cases",  "easier", "than", "writing", "out", "basic", "ones"};
        System.out.println(twoSort(a));
        

    }
    public static String twoSort(String[] a) {
        Arrays.sort(a);
        return String.join("***",a[0].split(""));
      }

          
        
     
}