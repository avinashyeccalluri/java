/**
 * PractiseAgain
 */
import java.util.*;
public class QueueTiming {

  public static void main(String[] args) {
    int a[]={2,3,5,10};
    System.out.println(solveSuperMarketQueue(a, 2));
  }
  public static int solveSuperMarketQueue(int[] customers, int n) {
    int[] result = new int[n];
    for(int i = 0; i < customers.length; i++){
      result[0] += customers[i];
      Arrays.sort(result);
    }
    return result[n-1];
  }
}