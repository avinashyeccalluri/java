/**
 * KfrequentElements
 */import java.util.*;
import java.util.*;
public class KfrequentElements {

    public static void main(String[] args) {
        // topKFrequent(new int[] {1}, 1);
        print(topKFrequent(new int[] {1,1,1,2,2,3}, 2));
    }
    public static List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> result=new ArrayList<>();
        Arrays.sort(nums);
        int count=1;
        if(nums.length==1) {
            result.add(nums[0]);
            return result;
        }
        for(int i =0;i<nums.length-1;i++){
            int j=i+1;
            if(nums[i]==nums[j]){
                count++;
            }else{
                count=1;
            }
            boolean a=result.contains(nums[i]);
            if(!result.contains(nums[i]) && count>=k){
                result.add(nums[i]);
                i=j;
            }
        }return result;        
    }
    public static void print(List<Integer> input){
        for(int i:input){
            System.out.println(i);
        }
    }
}