/**
 * TwoSum
 */
public class TwoSum {

    public static void main(String[] args) {        
        int[] zx={3,2,4};
        printArray(twoSum(zx, 6));
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] a=new int[2];
        for(int i=0;i<nums.length;i++){
            int j;
            for(j=0;j<nums.length;j++){
                if(i==j){
                    continue;
                }
                if(nums[i]+nums[j]==target){
                    a= new int[] {j,i};
                }
            }
        }return a;
        
    }
    public static void printArray(int[] input){
        for (int i : input) {
            System.out.println(i);
        }
    }
}