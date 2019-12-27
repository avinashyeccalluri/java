package LeetCode;

import java.util.HashSet;

/**
 * UniqueMorseRepresentations
 */
public class UniqueMorseRepresentations {

  public static void main(String[] args) {
    String[] a=new String[] {"gin", "zen", "gig", "msg"};
    System.out.println(uniqueMorseRepresentations(a));
  }
  public static int uniqueMorseRepresentations(String[] words) {
        String[] code=new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> h = new HashSet<String>(); 
        for(int i=0;i<words.length;i++){
          String storing="";
          char[] a=words[i].toCharArray();
          for(char c:a){
            int alphabetValue=c-96;
            storing+=code[alphabetValue-1];
          }
          h.add(storing);
          storing="";
        }        
        return h.size();
  }
}