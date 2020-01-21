package LeetCode;
import java.util.*;
/**
 * WordPatter
 */
public class WordPatter {

    public static void main(String[] args) {
       System.out.println(wordPattern("abcdea", "dog is a loyal animal dogs"));
    }
    public static  boolean wordPattern(String pattern, String str) {
        Set<Character> set=new HashSet<>();
        Map<Character,String> map=new HashMap<>();
        char[] patterns=pattern.toCharArray();
        String[] strs=str.split(" ");
        if(patterns.length!=strs.length) return false;
        for(int i =0;i<strs.length;i++){
            if(set.add(patterns[i]) && !map.containsValue(strs[i])){
                map.put(patterns[i], strs[i]);
            }else{
                String temp=map.get(patterns[i]);
                if(temp==null ||!temp.equals(strs[i])) return false;
            }
        }return true;
    }
}