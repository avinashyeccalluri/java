package LeetCode;

/**
 * ReverseInteger
 */
public class ReverseInteger {

  public static void main(String[] args) {
    System.out.println(reverse(123));
  }
  public static int reverse(int x) {    
    int ab=x;
    if(x<0){
      x=-x;
    }
    char[] a=(String.valueOf(x)).toCharArray();
    String b="";
    for(char c:a){
      b=c+b;
    }
    if(ab<0){
      return -Integer.parseInt(b);
    }
    return Integer.parseInt(b);
}
}