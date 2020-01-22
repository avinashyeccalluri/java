/**
 * NumberOfDivisors
 */
public class NumberOfDivisors {

    public static void main(String[] args) {
        System.out.println(12);
    }
    public static long numberOfDivisors(int n) {
        long count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0) {
                count++;
            }
        }return count;
      }
}