/**
 * CountingDuplicates
 */
public class CountingDuplicates {

    public static void main(String[] args) {
        duplicateCount("avinash");
        System.out.println(duplicateCount("avinash"));
    }
    public static int duplicateCount(String text) {
        int count=0;
        for(int i=0;i<text.length();i++){
            if(text.charAt(i)!=text.lastIndexOf(i)){
                count++;
            }
        }return count;
      }
}