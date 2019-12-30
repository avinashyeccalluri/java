package LeetCode;

import java.util.Arrays;

// import java.util.*;
/**
 * ArrayPairSum
 */
public class ArrayPairSum {

    public static void main(String[] args) {
        System.out.println(arrayPairSum(new int[] {1,4,3,2}));
    }
    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int result=0;
        for(int i=0;i<nums.length;i+=2){
            result+=nums[i];
        }return result;
        
    }
}