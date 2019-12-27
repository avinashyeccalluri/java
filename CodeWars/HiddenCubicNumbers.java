package CodeWars;import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * HiddenCubicNumbers
 */
public class HiddenCubicNumbers {

    public static void main(String[] args) {
        String s = "asdascd407";
        System.out.println(isSumOfCubes(s));
    }
    public static String isSumOfCubes(String s) {
        int count=0;
        int total=0;
        String c="";
        Pattern p = Pattern.compile("[0-9]+");
        Matcher m = p.matcher(s);
        ArrayList<String> allMatches = new ArrayList<>();
        ArrayList<Integer> lastMatches = new ArrayList<>();
        while (m.find()) {
        allMatches.add(m.group());
        }
        for (String i : allMatches) {
            int a =Integer.parseInt(i);
            int b=0;
            if(a==0 ){
                b+=0;
            }          
            while(a>0){
                b=(int)Math.pow((a%10),3)+b;
                a=a/10;
            }
            if((b)==Integer.parseInt(i) ){
                c+=i+ " ";
                lastMatches.add(b);
                count++;
            }
        }
        for(Integer as:lastMatches){
            total+=as;
        }
        if(count>0){
            return c+=total+" "+"Lucky";
        }
        return "Unlucky";
	}
}