package LeetCode;
import java.util.*;
/**
 * ArrayListOfArray
 */
public class ArrayListOfArray {

    public static void main(String[] args) {
        minimumAbsDifference(new int[]{4,2,1,3});
    }
    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> res=new ArrayList();
        int something=Integer.MAX_VALUE;
        for(int i = 0 ;i < arr.length-1;i++){
            int addedValue=arr[i+1]-arr[i];
            if(addedValue<something){
                something=addedValue;
                res.clear();
                res.add(Arrays.asList(arr[i],arr[i+1]));
            }else if(something==addedValue){
                res.add(Arrays.asList(arr[i],arr[i+1]));
            }addedValue=0;
        }return res;
        
    }
}