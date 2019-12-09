package CodeWars;

/**
 * RowOfOddTriangle
 */
public class RowOfOddTriangle {

  public static void main(final String[] args) {
    longArray(oddRow(5541));
  }
  public static long[] oddRow(final int n) {
    int firstValue=1;
    if(n==1){
      return new long[] {1};
    }
    for(int i=1;i<n;i++){
      firstValue+=(2* i);
    }
    final long[] longArray=new long[n];
    for(int i=0;i<longArray.length;i++){
      longArray[i]=firstValue+(2*i);
    }
    return longArray;
  }
  static void longArray(final long[] input){
    for (final long l : input) {
      System.out.println(l);
    }
  }
}