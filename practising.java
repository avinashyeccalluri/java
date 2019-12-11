import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * practising
 */
public class practising {

  public static void main(String[] args) {
    Pattern p = Pattern.compile("[a-z]+|\\d+");
        Matcher m = p.matcher("a1b22");
        ArrayList<String> allMatches = new ArrayList<>();
        while (m.find()) {
        allMatches.add(m.group());
        }
        for (String string : allMatches) {
          System.out.println(string);
        }
        // for(int i=1;i<allMatches.size();i+=2){
        //     int k=i-1;
        //     for(int j=0;j<Integer.parseInt(allMatches.get(i));j++){
        //         System.out.print(allMatches.get(k));
        //     }
        // }
  }
}