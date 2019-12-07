/**
 * LastnameSorting
 */
import java.util.regex.*;
import java.util.stream.Collectors;
import java.util.*;  
public class LastnameSorting {

    public static void main(String[] args) {

        String s = "Fred:Corwill;Wilfred:Corwill;Barney:Tornbull;Betty:Tornbull;Bjon:Tornbull;Raphael:Corwill;Alfred:Corwill";
        System.out.println(meeting(s));
        // System.out.println("everything is fine");
        // String c="Fred: corwill";
        // String a="avinash";
        // String b="kanesh";
        // System.out.println(b>a);
        // System.out.println(c.indexOf(':')+1);

        // //-------------------------------------------------------------
        // // Pattern p = Pattern.compile(".s");//. represents single character  
        // // Matcher m = p.matcher("as");  
        // // boolean b = m.matches();  
        // // System.out.println(b);
        // //---------------------------------------------
        
    }
    public static String meeting(String s) {
        return Arrays.stream(s.toUpperCase().split(";"))
                     .map(guest -> guest.replaceAll("(\\w+):(\\w+)", "($2, $1)"))
                     .sorted()
                     .collect(Collectors.joining(""));
      }
}