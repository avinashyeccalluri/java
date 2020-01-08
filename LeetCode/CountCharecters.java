package LeetCode;
import java.util.*;
/**
 * CountCharecters
 */
public class CountCharecters {

  public static void main(String[] args) {
    System.out.println(longestPalindrome("avinash"));
  }
  public static int longestPalindrome(String s) {
    int[] map = new int[26];``
    for (char c : s.toCharArray()) {
        map[c-97]++;
    }
    boolean hasOdd = false;
    int cnt = 0;
    for (int i = 0; i < 26; ++i) {
      int a=map[i];
        if (map[i] % 2 == 1) hasOdd = true;
        cnt += map[i]/2;
    }
    cnt *= 2;
    if (hasOdd) cnt++;
    return cnt;
}
  
}