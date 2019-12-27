/**
 * LastnameSorting
 */package CodeWars;
import java.util.regex.*;
import java.util.stream.Collectors;
import java.util.*;  
public class LastnameSorting {

    public static void main(String[] args) {

        String s = "Fred:Corwill;Wilfred:Corwill;Barney:Tornbull;Betty:Tornbull;Bjon:Tornbull;Raphael:Corwill;Alfred:Corwill";
        System.out.println(meeting(s));        
    }
    public static String meeting(String s) {
        return Arrays.stream(s.toUpperCase().split(";"))
                     .map(guest -> guest.replaceAll("(\\w+):(\\w+)", "($2, $1)"))
                     .sorted()
                     .collect(Collectors.joining(""));
      }
}