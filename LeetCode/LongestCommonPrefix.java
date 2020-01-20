package LeetCode;
import java.util.*;
/**
 * LongestCommonPrefix
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[] {"carcar","racecar","carcar"}));
    }

    public static String longestCommonPrefix(String[] strs) {
        
            if (strs.length < 1)
                return "";
            if (strs.length == 1)
                return strs[0];
            
            String temp = strs[0];
            
            int i = 1;
            String cur;
            
            while(temp.length() > 0 && i < strs.length){
                if (temp.length() > strs[i].length())
                    temp = temp.substring(0,strs[i].length());
                
                cur = strs[i].substring(0, temp.length());
                if (!cur.equals(temp)){
                    temp = temp.substring(0, temp.length() - 1);
                } else{
                    i++;
                }
            }            
            return temp;
        }
        
    }
