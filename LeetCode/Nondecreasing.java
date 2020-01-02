package LeetCode;

/**
 * Nondecreasing
 */
public class Nondecreasing {

  public static void main(String[] args) {
    System.out.println(checkPossibility(new int[] {4,2,5,9}));
  }
  // public static boolean checkPossibility(int[] nums) {
    public static boolean checkPossibility(int[] nums) {
      boolean o = false;
      for(int i = 0; i < nums.length -1; i++){
          if(nums[i] > nums[i+1]){
              if(i == 0 || nums[i-1] <= nums[i+1]){
                  nums[i] = nums[i+1];
              } else {
                  nums[i+1] = nums[i];
              }
              if(o == false){
                  o = true;
              } else{
                  return false;
              }
          }
      }
      return true;
  }
}