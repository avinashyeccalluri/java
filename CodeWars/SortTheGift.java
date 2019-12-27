/**
 * SortTheGift
 */package CodeWars;
import java.util.*;
public class SortTheGift {

    public static void main(String[] args) {
        System.out.println(sortGiftCode("zyxwvutsrqponmlkjihgfedcba"));
    }
    public static String sortGiftCode(String code){
        char[] a=code.toCharArray();
        Arrays.sort(a);
        String b="";
        for (char c : a) {
            b+=c;
        }
        return b;
      }
}