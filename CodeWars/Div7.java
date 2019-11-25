/**
 * Div7
 */
public class Div7 {

  public static void main(String[] args) {
    printArray(seven(477557101));
  }
  public static long[] seven(long m){
    int lastDigit,remainingDigit,count;
    lastDigit=remainingDigit=count=0;
    while(m>99){
      count++;
      lastDigit=(int)m%10;
      remainingDigit=(int) m/10;
      m=remainingDigit-(2*lastDigit);    
  }
  return new long[] {m,count};
}
  public static void printArray(long[] someArray){
    for (long l : someArray) {
      System.out.println(l);      
    }
  }
}
 
  
