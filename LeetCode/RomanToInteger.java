package LeetCode;
import java.util.*;
// I             1
// V             5
// X             10
// L             50
// C             100
// D             500
// M             1000
/**
 * RomanToInteger
 */
public class RomanToInteger {

    public static void main(String[] args) {
        System.out.println(romanToInt("XXVII"));
    }
    public static int romanToInt(String s) {
        Map<Character,Integer> mapping=new HashMap<Character,Integer>();
        mapping.put('I', 1);
        mapping.put('V', 5);
        mapping.put('X', 10);
        mapping.put('L', 50);
        mapping.put('C', 100);
        mapping.put('D', 500);
        mapping.put('M', 1000);
        int result=0;
        char[] a=s.toCharArray();
        for (char c : a) {
            result+=mapping.get(c);
        }return result;
        
        
    }
}