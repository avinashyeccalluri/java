package LeetCode;

/**
 * ContainsDuplicateII
 */
public class ContainsDuplicateII {

    public static void main(String[] args) {
        int[] a={1,2,3,1};
        int k=3;
        System.out.println(containsNearbyDuplicate(a, k));
    }
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        for(int i =0; i< nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i!=j){
                    if(nums[i]==nums[j]){
                    if(Math.abs(i-j)==k){
                        return true;
                    }
                }
                }
            }
        }
        return false;
        
    }
}