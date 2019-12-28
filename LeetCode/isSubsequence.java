package LeetCode;
import java.util.*;
// ""
// "ahbgdc"
/**
 * isSubsequence
 */
public class isSubsequence {

    public static void main(String[] args) {
        System.out.println(isSubsequence("abdc","asbngcjkjnd"));
    }
    public static boolean isSubsequence(String s, String t) {
        if (s == null || t == null)
            return false;        
        int j = 0;
        for (char c : s.toCharArray()) {
            int index = t.indexOf(c, j);
            if (index == -1)
                return false;
            j = index + 1;
        }
        
        return true;
    }
}