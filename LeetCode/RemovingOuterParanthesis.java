package LeetCode;

/**
 * RemovingOuterParanthesis
 */
public class RemovingOuterParanthesis {

  public static void main(String[] args) {
    String a="()()";
    System.out.println(removeOuterParentheses(a));
  }
  public static String removeOuterParentheses(String S) {
    String result="";
    int start=0;
    int end=0;
    int index=0;
    int counting=0;
    char[] a=S.toCharArray();
    for(int i=0;i<a.length;i++){
       if(a[i]=='('){counting+=1;
      }else{counting-=1;
      }
      if(counting==0){        
        end=i;
        result+=S.substring(start+1, end);
        start=end+1;        
      }
    }return result;
        
  }
}