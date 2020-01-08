package LeetCode;
import java.util.*;
/**
 * UncommonWords
 */
public class UncommonWords {

    public static void main(String[] args) {
        System.out.println(uncommonFromSentences("this apple is sweet", "this apple is sour"));
    }
    public static String[] uncommonFromSentences(String A, String B) {
        int size = 0;
        int index = 0;
        HashMap<String, Integer> hMap = new HashMap<>();
        for(String s : A.split(" ")) hMap.put(s, hMap.getOrDefault(s, 0) + 1);    
        for(String s : B.split(" ")) hMap.put(s, hMap.getOrDefault(s, 0) + 1);    
        
        
        for(Map.Entry<String, Integer> entry : hMap.entrySet()){
            if(entry.getValue() == 1) size++;
        }
        String[] result = new String[size];
        
        for(Map.Entry<String, Integer> entry : hMap.entrySet()){
            if(entry.getValue() != 1) continue;
            result[index] = entry.getKey();
            index++;
        }
        
        return result; 

    }
}