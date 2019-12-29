package LeetCode;
import java.util.*;
/**
 * MoveZeros
 */
public class MoveZeros {

  public static void main(String[] args) {
    moveZeroes(new int[] {0,1,0,3,12});
  }
  public static void moveZeroes(int[] nums) {
    int i = 0, numZeroes = 0;
        
        for (i = 0; i < nums.length; i++) {
            if (nums[i] == 0) numZeroes++;
            else nums[i - numZeroes] = nums[i];
        }        
        Arrays.fill(nums, nums.length - numZeroes, nums.length, 0);
  }
  }
