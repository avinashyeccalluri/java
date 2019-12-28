package LeetCode;
import java.util.*;
/**
 * ParityOrder
 */
public class ParityOrder {

  public static void main(String[] args) {
    int[] A={1,2,3,4,5};
    System.out.println(sortArrayByParity(A));
  }
  public static int[] sortArrayByParity(int[] A) {
    int start=0;
    int end=A.length-1;
    int[] B=new int[A.length];
    for(int i =0;i<A.length;i++){
      if(A[i]%2==0){
        B[start++]=A[i];
      }else{
        B[end--]=A[i];
      }
    }return B;
        
  }
}