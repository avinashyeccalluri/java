package LeetCode;
import java.util.Map;
import java.util.HashMap;
// if (entry.getValue().equals("c")) {
//   System.out.println(entry.getKey());
// }
/**
 * MajorityElement
 */
public class MajorityElement {

  public static void main(String[] args) {
    System.out.println(majorityElement(new int[] {2,2,1,1,1,2,2}));
  }
  public static int majorityElement(int[] nums) {
    int count=1;
    int majority=nums[0];
    for (int i=1;i<nums.length;i++){
        if (count==0){
            majority=nums[i];
        }
        if (nums[i]==majority){
            count++;
        }else {
            count--;
        }
    }
    return majority;
}
  }
