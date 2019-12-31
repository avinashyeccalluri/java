package LeetCode;

import java.util.*;

/**
 * TopKFrequent
 */
public class TopKFrequent {

    public static void main(String[] args) {
        printArrayList(topKFrequent(new int[] {1,1,1,2,2,3},2));
    }
    public static  List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> list= new ArrayList<>();
        // TreeMap<Integer,Integer> hashmap=new TreeMap<>();
        HashMap<Integer,Integer> hashmap=new HashMap<>();
        for(Integer i:nums){
            if(hashmap.containsKey(i)){
                hashmap.put(i, hashmap.get(i)+1);
            }else{
                hashmap.put(i,1);
            }
        }
        // entriesSortedByValues(hashmap);
        
        for(int i:hashmap.keySet()){
            int temp=hashmap.get(i);
            if(k<=temp){
                list.add(i);
            }
        }return list;
    }

    public static void printArrayList(List<Integer> input){
        for(Integer i:input){
            System.out.println(i);
        }
    }
}