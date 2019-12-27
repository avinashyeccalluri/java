package LeetCode;
import java.util.*;

/**
 * RemoveDuplicates
 */
public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] a={12,345,2,6,7896};
        // removeDuplicates(a);
        System.out.println(findNumbers(a));
    }
    public static void removeDuplicates(int[] nums) {
        Set<Integer> sets=new HashSet<>();
        for(int i:nums){
            sets.add(i);
        }
        System.out.println("The size is "+sets.size());
        for (int var : sets) {
            System.out.println(var);
        }
    }
    public static int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(String.valueOf(nums[i]).length()%2==0){
                count++;
            }
        }return count;
    }
}