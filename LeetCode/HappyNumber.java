package LeetCode;

/**
 * HappyNumber
 */
public class HappyNumber {

  public static void main(String[] args) {
    System.out.println(isHappy(1111111));
  }
  public static boolean isHappy(int n) {
        boolean result=true;
        int count=0;
        char[] input=null;
        while(result){
          input=String.valueOf(n).toCharArray();
        for(int i=0;i<input.length;i++){
            count+=(int) Math.pow(input[i]-48,2);
        }
        result=count>=10 || count==7;
        n=count;
        count=0;
      }return n==1;
  }
}