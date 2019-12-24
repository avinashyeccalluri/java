package CodeWars;

/**
 * squareDigits
 */
public class squareDigits {

  public static void main(String[] args) {
    System.out.println(squareDigits(7324));
  }
  public static int squareDigits(int n) {
    
    String result="";
    while(n>0){
      result=(int)Math.pow((n%10),2)+result;
      n=n/10;
    }return Integer.parseInt(result);
  }
}