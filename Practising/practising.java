import java.util.HashMap;
import java.util.HashSet;

/**
 * practising
 */
public class practising {

    public static void main(String[] args) {
        System.out.println(uniqueOccurrences(new int[] {1,2}));
    }
    public static boolean uniqueOccurrences(int[] input){
        HashMap<Integer,Integer> hashmap=new HashMap<>();
        for(int i =0;i<input.length;i++){
            if(!hashmap.containsKey(input[i])){
                hashmap.put(input[i], 1);
            }else{
                hashmap.put(input[i],hashmap.get(input[i])+1);
            }
        }
        HashSet set=new HashSet<>();
        for(Integer i:hashmap.values()){
            if(set.contains(i)){
                return false;
            }
            else{
                set.add(i);
            }
        }return true;
    }
}