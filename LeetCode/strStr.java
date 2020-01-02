package LeetCode;

/**
 * strStr
 */
public class strStr {

  public static void main(String[] args) {
    System.out.println(strStr("a","a"));
  }
  public static int strStr(String haystack, String needle) {
    if(haystack.length()==0 && needle.length()==0 || haystack.length()>0 && needle.length()==0 ){
      return 0;
    }
        for(int i =0;i<haystack.length();i++){
          int j;
          for(j=0;j<needle.length();j++){
            if( haystack.charAt(i)==needle.charAt(0)){
              return i;
            }
          }
        }return -1;
  }
}