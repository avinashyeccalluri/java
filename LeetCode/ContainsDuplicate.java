package LeetCode;
import java.util.*;
/**
 * ContainsDuplicate
 */
public class ContainsDuplicate {

  public static void main(String[] args) {
    System.out.println(containsDuplicate(new int[] {1,2,3,4,1}));
  }
  public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set=new HashSet<Integer>();
        // StringBuilder a=new StringBuilder();
        for(int i:nums){
          set.add(i);
        }
        return nums.length!=set.size();
  }
  // public static boolean containsDuplicate(int[] nums) {
  //       HashMap<Integer,Integer> hashMap=new HashMap<>();
  //       for(Integer i:nums){
  //         hashMap.put(i,hashMap.getOrDefault(i, 0)+1);
  //       }
  //       for(Integer i:hashMap.values()){
  //         if(i==2){
  //           return true;
  //         }
  //       }return false;
  // }
}