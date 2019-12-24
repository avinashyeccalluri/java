package CodeWars;

/**
 * DivisibleCountrange
 */
public class DivisibleCountrange {

  public static void main(String[] args) {
    System.out.println(divisibleCount(6, 1000, 2));
  }
  public static long divisibleCount(long x, long y, long k) {
    if(x%k==0){
      return ((y/k)-(x/k)+1);
    }else return (y/k)-(x/k);
  } 
}