package LeetCode;

import java.util.*;

/**
 * CommonCharecters
 */
public class CommonCharecters {

    public static void main(String[] args) {
        printArrayList(commonChars(new String[] {"acabcddd","bcbdbcbd","baddbadb","cbdddcac","aacbcccd","ccccddda","cababaab","addcaccd"}));
    }
    public static List<String> commonChars(String[] A) {
        HashMap<Character,Integer> hashmap=new HashMap<>();
        ArrayList<String> arrayList=new ArrayList<>();
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[i].length();j++){
                if(hashmap.containsKey(A[i].charAt(j))){
                    hashmap.put(A[i].charAt(j),hashmap.get(A[i].charAt(j))+1);
                }else if( i==0){
                    hashmap.put(A[i].charAt(j), 1);
                }
            }
        }
        for(Character c:hashmap.keySet()){
            int k=hashmap.get(c);
            for(int i =0;i<k/A.length;i++){
                arrayList.add(Character.toString(c));
            }
        }
        return  arrayList;
        
    }
    public static void printArrayList(List<String> input){
        for(String s:input){
            System.out.println(s);
        }
    }
}