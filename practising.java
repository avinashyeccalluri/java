import java.util.ArrayList;
import java.util.*;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * practising
 * https://www.codewars.com/kata/search/java?q=&r%5B%5D=-8&tags=Strings&beta=false
//  */
// s1 = "6900690040"
// s2 = "4690606946"
// s3 = "9990494604"
//https://www.codewars.com/kata/search/java?q=&r%5B%5D=-7&tags=Strings&beta=false
public class practising {

  public static void main(String[] args) {
    System.out.println(uncommonFromSentences("this apple is sweet", "this apple is sour"));
    }
    public static String[] uncommonFromSentences(String A, String B) {
      int size=0;
      int index=0;
      HashMap<String,Integer> hashMap=new HashMap<>();
      for(String s:A.split(" ")) hashMap.put(s,hashMap.getOrDefault(s, 0)+1);
      for(String s:B.split(" ")) hashMap.put(s,hashMap.getOrDefault(s, 0)+1);
      for(Integer i:hashMap.values()){
        if(i==1) size++;
      }
      String[] result=new String[size];
      for(Map.Entry<String,Integer> entry:hashMap.entrySet()){
        if(entry.getValue()==1){
          result[index]=entry.getKey();
          index++;
        }
      }
      
      return result;
    }

    
}

