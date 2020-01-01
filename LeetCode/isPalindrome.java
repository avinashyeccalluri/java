package LeetCode;

/**
 * isPalindrome
 */
public class isPalindrome {

  public static void main(String[] args) {
    System.out.println(isPalindrome("race a car"));
  }
  public static boolean isPalindrome(String s){
    String a =s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
    int count=0;
    for(int i=a.length()-1;i>0 && count<=a.length();i--){
      if(a.charAt(i)!=a.charAt(count)){
        return false;        
      }count++;
    }return true;
  }
}