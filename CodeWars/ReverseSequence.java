/**
 * ReverseSequence
 */
public class ReverseSequence {

    public static void main(String[] args) {
        printArray(reverse(5));
    }
    public static int[] reverse(int n){
        //your code
        int[] result=new int[n];
        int j=0;
        for(int i=n;i>=1;i--){
            result[j++]=i;
        }return result;
      }
    public static void printArray(int[] result){
        for(int i:result){
            System.out.println(i);
        }
    }
}