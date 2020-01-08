package LeetCode;
import java.util.*;
/**
 * AdjacentDuplicates
 */
public class AdjacentDuplicates {

  public static void main(String[] args) {
    System.out.println(removeDuplicates("abbaca"));
  }
  public static  String removeDuplicates(String S) {
    String result="";
    Stack<Character> stack=new Stack<>();
    char[] input=S.toCharArray();
    boolean flag=true;
    while(flag)    {
    for(int i=0;i<input.length;i++){
        if(i==0){
          stack.push(input[i]);
        }else if(input[i-1]==input[i]){
          stack.pop();
        }else{
          stack.push(input[i]);
        }
    }
  }
    for (Character s:stack) {
      result+=s;      
    }
    return result;
        
  }
}