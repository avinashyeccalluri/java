package ProQuestions;

/**
 * ArrayRotation
 */
public class ArrayRotation {

  public static void main(String[] args) {
    int[] a ={1,2,3,4,5};
    printArray(rotate_list(a, 5));
  }
  public static int[] rotate_list(int[] nums,int k){
    reverse(nums, 0, k);
  reverse(nums, k, nums.length);
  reverse(nums, 0, nums.length);
  return nums;
  }
  public static void reverse(int[] nums,int start,int end){
    for(int i=0;i<(end - start)/2;i++){
      int temp=nums[start + i];
      nums[start + i]=nums[end - 1 - i];
      nums[end - 1 - i]=temp;
    }
  }
  public static void printArray(int[] input){
    for (int i : input) {
      System.out.println(i);
    }
  }
}