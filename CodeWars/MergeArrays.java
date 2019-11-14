/**
 * MergeArrays
 */
import java.util.*;
public class MergeArrays {

  public static void main(String[] args) {
    System.out.println(
    findShort("turns out random test cases are easier than writing out basic ones"));
    
  }
  public static int findShort(String s) {
    ArrayList<Integer> splittted=new ArrayList<>();
    for(String i:s.split(" ")){
      splittted.add(i.length());
    }
    return( (Collections.min(splittted)));       
  }
}