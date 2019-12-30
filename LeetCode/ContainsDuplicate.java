package LeetCode;
import java.util.*;
/**
 * ContainsDuplicate
 */
public class ContainsDuplicate {

  public static void main(String[] args) {
    System.out.println(containsDuplicate(new int[] {1,2,3,4}));
  }
  public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set=new HashSet<Integer>();
        for(int i:nums){
          set.add(i);
        }
        return nums.length!=set.size();
  }
}