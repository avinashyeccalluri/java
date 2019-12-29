package LeetCode;
import java.util.*;
/**
 * RemovingOuterParanthesis
 */
public class RemovingOuterParanthesis {

  public static void main(String[] args) {
    String a="()()";
    System.out.println(removeOuterParentheses(a));
  }
  public static String removeOuterParentheses(String S) {
    StringBuilder builder = new StringBuilder();
        Stack<Character> s = new Stack<Character>();
        int l = -1;
        for(int i = 0; i < S.length(); i++){
            char ch = S.charAt(i);
            if(ch == '('){
                s.push(ch);
                if(l == -1) l = i+1;
            }else{
                s.pop();
            }
            if(s.isEmpty()){
                builder.append(S.substring(l, i));
                l = -1;
            }
        }
        return builder.toString();
        
  }
}