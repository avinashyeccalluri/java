package LeetCode;
import java.util.*;

/**
 * TwoSum
 */
public class TwoSum {

    public static void main(String[] args) {
        pritnArray((twoSum(new int[] {2, 15, 11, 7}, 9)));
    }
    public static  int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
    for(int i = 0; i < nums.length; i++) {
        int a=(target - nums[i]);
        if(map.containsKey(target - nums[i]))
            return new int[]{map.get(target-nums[i]), i};
        map.put(nums[i], i);
    }
    return new int[]{-1, -1};
    }
    public static void pritnArray(int[] input){
        for(int i:input){
            System.out.println(i);
        }
    }
}