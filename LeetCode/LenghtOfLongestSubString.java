package LeetCode;
import java.util.*;
/**
 * LenghtOfLongestSubString
 */
public class LenghtOfLongestSubString {

    public static void main(String[] args) {
        // System.out.println(lengthOfLongestSubstring("abcabcbb"));
        printArray(relativeSortArray(new int[]{2,3,1,3,2,4,6,7,9,2,19}, new int[] {2,1,4,3,9,6}));
    }
    public static int lengthOfLongestSubstring(String s) {
        int[] count = new int[128];
        int i = 0, n = s.length(),res = 0;
        for (int j = 0;j < n;j++) {
            char c = s.charAt(j);
            count[c]++;
            while (count[c] > 1){
                char d = s.charAt(i);
                count[d]--;
                i++;
            }
            res = Math.max(res, j - i + 1);
        }
        return res;
    }
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        TreeMap<Integer, Integer> hashmap = new TreeMap<Integer, Integer>(); 
        for(int i:arr1) hashmap.put(i,hashmap.getOrDefault(i, 0)+1);
        for(int i:arr2) hashmap.put(i,hashmap.getOrDefault(i, 0)+1);
        int[] reuslt=new int[hashmap.size()];int index=0;
        for(Integer i:hashmap.keySet()){
            int temp=hashmap.get(i);
            reuslt[index]=i;index++;
        }return reuslt;
    }
    public static void printArray(int[] input){
        for(Integer i:input){
            System.out.println(i);
        }
    }

}