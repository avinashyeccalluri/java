package LeetCode;
import java.util.*;
import java.util.HashMap;
/**
 * findSpecialInteger
 */
public class findSpecialInteger {

    public static void main(String[] args) {
        System.out.println(findSpecialInteger(new int[] {1,2,2,6,6,6,6,7,10}));
    }
    public static int findSpecialInteger(int[] arr) {
        HashMap<Integer,Integer> hashmap=new HashMap<>();
        int percentage=arr.length/4;
        for(Integer i :arr) hashmap.put(i, hashmap.getOrDefault(i, 0)+1);
        for(Map.Entry<Integer,Integer> entry:hashmap.entrySet()){
            if(entry.getValue()>percentage){
                return entry.getKey();
            }
        }return -1;
    }
    

}