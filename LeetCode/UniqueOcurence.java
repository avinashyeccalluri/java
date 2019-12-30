package LeetCode;
import java.util.*;
/**
 * UniqueOcurence
 */
public class UniqueOcurence {

    public static void main(String[] args) {
        System.out.println(uniqueOccurrences(new int[] {1,2}));
    }   
        public static boolean uniqueOccurrences(int[] arr) {
            HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
            for(int i = 0; i < arr.length; i++){
                if(!map.containsKey(arr[i])){
                    map.put(arr[i], 1);
                }
                else{
                    map.put(arr[i], map.get(arr[i]) + 1);
                }
            }
            
            HashSet set = new HashSet();
            
            for(Integer i : map.values()){
                if(set.contains(i)){
                    return false;
                }
                else{
                    set.add(i);
                }
            }
            return true;
        }
        }
        
    
