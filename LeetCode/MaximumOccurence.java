package LeetCode;

import java.util.HashMap;

/**
 * MaximumOccurence
 */
public class MaximumOccurence {

    public static void main(String[] args) {
        System.out.println(maxInteger(new int[] {1,2,2,2,2,2,1}));
    }
    public static int maxInteger(int[] input){
        HashMap<Integer,Integer> hashmap=new HashMap<>();
        for(int i=0;i<input.length;i++){
            if(hashmap.containsKey(input[i])){
                hashmap.put(input[i], hashmap.get(input[i])+1);
            }else{
                hashmap.put(input[i], 1);
            }
        }for(int i:hashmap.keySet()){
            int k =hashmap.get(i);
            if(k>input.length/2)
            {
        return i;
        }}return -1;
    }
}