import java.util.ArrayList;
import java.util.*;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * practising
//  */
// s1 = "6900690040"
// s2 = "4690606946"
// s3 = "9990494604"
//https://www.codewars.com/kata/search/java?q=&r%5B%5D=-7&tags=Strings&beta=false
public class practising {

  public static void main(String[] args) {
    System.out.println(tidyNumber(123456789));
    }
    public static boolean tidyNumber(int a)
    { if(a==0){
      return false;
    }
      String[] b=(String.valueOf(a).split(""));
      int count=0;
      for(int i=0 ;i<b.length-1;i++){
        if(b[i].compareTo(b[i+1])<0){
          count++;
        }
      }if(count==b.length-1){
        return(true);
      }return(false);
    }
}

