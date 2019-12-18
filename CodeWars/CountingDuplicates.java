/**
 * CountingDuplicates
 */
import java.util.HashSet;
public class CountingDuplicates {

    public static void main(String[] args) {
        // System.out.println(duplicateCount("avinash"));
        duplicateCount("avinash");
        System.out.println(duplicateCount("avinash"));
    }
    public static int duplicateCount(String text) {
        if(text == null || text.length() < 2){
          return 0;
        }
        HashSet<Character> letters = new HashSet<Character>();
        HashSet<Character> dupsFound = new HashSet<Character>();
        for(int i = 0; i < text.length(); i++){
          char letter = Character.toLowerCase(text.charAt(i));
          if(letters.contains(letter)){
            dupsFound.add(letter);
          }else{
            letters.add(letter);
          }
        }
        return dupsFound.size();
      }

    
}