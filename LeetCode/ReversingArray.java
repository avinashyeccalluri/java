package LeetCode;

/**
 * ReversingArray
 */
public class ReversingArray {

  public static void main(String[] args) {
    String[] a ={"h","e","l","l","o"};
    // reverseString(a); use sysout

  }
  
  public static void reverseString(char[] s) {
    int mid=s.length/2;
    for(int i=0;i<mid;i++){
        char temp=s[i];
        s[i]=s[s.length-1-i];
        s[s.length-1-i]=temp;
    }    
}
}