package LeetCode;
import java.util.*;
/**
 * MissingNumber
 */
public class MissingNumber {

    public static void main(String[] args) {
        System.out.println(missingNumber(new int[] {0,1}));
    }
    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int total=nums[nums.length-1]*(nums[nums.length-1]+1)/2;
        if(total-sum==0){ return nums[nums.length-1]+1;}
        else{
            return total-sum;
        }
        
        
    }
}