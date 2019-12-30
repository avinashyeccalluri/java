package LeetCode;

import java.util.Arrays;

/**
 * IsAnagram
 */
public class IsAnagram {

  public static void main(String[] args) {
    System.out.println(isAnagram("anagram", "nagaram"));
  }
  public static boolean isAnagram(String s, String t) {
    int[] map = new int[26];
    for(char c : s.toCharArray())
     map[c - 'a']++;
    for(char c : t.toCharArray()) 
    map[c - 'a']--;
    for(int i : map) if(i != 0) return false;
    return true;
}
}