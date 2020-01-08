package LeetCode;
import java.util.*;
/**
 * IntersectionOfTwoArrays
 */
public class IntersectionOfTwoArrays {

  public static void main(String[] args) {
    printArray(intersection(new int[]{4,9,5}, new int[] {9,4,9,8,4}));
  }
  public static int[] intersection(int[] nums1, int[] nums2) {
    Set<Integer> setA = new HashSet<>();
        Set<Integer> setAB = new HashSet<>();
		int i = 0;

        for(int n : nums1)
			setA.add(n);

        for(int n : nums2)
		{
            if(setA.contains(n))
			{
                setAB.add(n);
            }
        }

        int[] result = new int[setAB.size()];

		for(int n : setAB)
            result[i++] = n;

        return result;
      }
      public static void printArray(int[] input){
        for(int i:input){
          System.out.println(i);
        }
      }

  }
