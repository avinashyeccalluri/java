package LeetCode;
import java.util.*;
/**
 * SetMisMatch
 */
public class SetMisMatch {

    public static void main(String[] args) {
        
    }
    public int[] findErrorNums(int[] nums) {
        List<Integer> result=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            int j=i+1;
            if(nums[i]==nums[j] nums[j-1]==nums[i]-1){
                result.add(nums[i]); 
                result.add(nums[i]+1);                
            }else{
                result.add(nums[i]); 
                result.add(nums[i]-1);
            }
        }
        if(result.size()==0) return null;
        int[] resultant=new int[result.size()];
        for(int i=0;i<result.size();i++){
            resultant[i]=result.get(i);
        }
        return resultant;
    }
}