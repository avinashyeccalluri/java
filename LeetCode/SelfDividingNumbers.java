package LeetCode;

import java.util.*;

/**
 * SelfDividingNumbers
 */
public class SelfDividingNumbers {

  public static void main(String[] args) {
    printArrayList(selfDividingNumbers(1, 12));
  }
  public static List<Integer> selfDividingNumbers(int left, int right) {
    List<Integer> result=new ArrayList<>();
    for(int i=left;i<=right;i++){
      int temp=i;
      String summa=String.valueOf(i);
      int count=0;int ten=10;
      if(temp==10){
        ten+=10;
        continue;
      }
      while(temp>0){
        int value=temp%10;
        if(temp%value==0){
          temp/=10;
          count++;
        } }
        if(count==summa.length()){
          result.add(i);
        }
        else{
          break;
        }      
    }return result;        
  }
  public static void printArrayList(List<Integer> input){
      for(int i:input){
        System.out.println(i);
      }
  }
}