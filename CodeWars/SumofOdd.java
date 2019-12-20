/**
 * SumofOdd
 */
public class SumofOdd {

    public static void main(String[] args) {
        // System.out.println(oddRow(3));
        printLong(oddRow(-5));
    }
    public static long[] oddRow(final int n) {
        int firstValue=1;
    
        for(int i=0;i<n;i++){
          firstValue+=(2* i);
        }
         long[] longArray=new long[n];
        for(int i=0;i<longArray.length;i++){
          longArray[i]=firstValue+(2*i);
        }
        return longArray;
      }
      public static void printLong(long[] input){
          for (long l : input) {
              System.out.println(l);
          }
      }
}