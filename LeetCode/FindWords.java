package LeetCode;
import java.util.*;
/**
 * FindWords
 */
public class FindWords {

    public static void main(String[] args) {
        printArray(findWords1(new String[] {"Hello", "Alaska", "Dad", "Peace"}));
    }
    public static String[] findWords1(String[] words) {
        String row1="qwertyuiop";
        String row2="asdfghjkl";
        String row3="zxcvbnm";
        HashMap<Character,Integer> hashMap=new HashMap<>();
        for(char c:row1.toCharArray()){
            hashMap.put(c,1);
        }
        for(char c:row2.toCharArray()){
            hashMap.put(c,2);
        }
        for(char c:row3.toCharArray()){
            hashMap.put(c,3);
        }
        List<String> ans = new ArrayList<>();
        for(String word:words){
            if(word.length()>0){
                char start=word.charAt(0);
                int beginingIndex=hashMap.get(start);
                boolean flag=true;
                for(int j=1;j<word.length();j++){
                    if(Character.toLowerCase(word.charAt(j))!=beginingIndex){
                        flag=false;
                        break;
                    }
                }if(flag){
                    ans.add(word);
                }
            }
        }return ans.toArray(new String[ans.size()]); 

    }
    public static void printArray(String[] input){
        for(String s:input){
            System.out.println(s);
        }
    
}