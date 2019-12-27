package LeetCode;

/**
 * BalancedStringSplit
 */
// s = "RLRRLLRLRL"
public class BalancedStringSplit {

  public static void main(String[] args) {
    System.out.println(balancedStringSplit("RLLLLRRRLR"));
  }
  public static int balancedStringSplit(String s) {
        char[] a=s.toCharArray();
        int result=0;
        int counting=0;
        for(char c:a){
          if(c=='R'){
            counting+=1;
          }else{
            counting-=1;
          }
          if(counting==0){
            result+=1;
          }
        }return result;
  }
}