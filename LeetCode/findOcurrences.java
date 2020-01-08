package LeetCode;
import java.util.*;
/**
 * findOcurrences
 */
public class findOcurrences {

    public static void main(String[] args) {
        // System.out.println(findOcurrences("jkypmsxd jkypmsxd kcyxdfnoa jkypmsxd kcyxdfnoa jkypmsxd kcyxdfnoa kcyxdfnoa jkypmsxd kcyxdfnoa","kcyxdfnoa","jkypmsxd"));
        // printArray(findOcurrences("we will we will rock you","we","will"));
        printArray(findWords(new String[] {"Hello", "Alaska", "Dad", "Peace"}));
    }
    public static String[] findOcurrences(String text, String first, String second) {
        ArrayList<Integer> arraylist = new ArrayList<>();
        int index=0;
        String[] result=null;
        String[] a=text.split(" ");
        for(int i =0;i<a.length-1;i++){
            if(a[i].equals(first) && a[i+1].equals(second) && (i+2)<a.length && (i+1)<a.length ){
                if(!a[i+2].equals(first))arraylist.add(i+2);
                
            }
        }result=new String[arraylist.size()];
        for(int i =0;i<arraylist.size() ;i++){
            result[index]=a[arraylist.get(i)];index++;
        }return result;
    }
    public static void printArray(String[] input){
        for(String s:input){
            System.out.println(s);
        }
    }
    public static String[] findWords(String[] words) {
        
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";
        
        Map<Character, Integer> map = new HashMap<>();
        
        for(char c:row1.toCharArray()){
            map.put(c, 1);
        }
        for(char c:row2.toCharArray()){
            map.put(c, 2);
        }
        for(char c:row3.toCharArray()){
            map.put(c, 3);
        }
        
        List<String> ans = new ArrayList<>();
        for(String word:words){
            
            if(word.length() > 0){
                char c = Character.toLowerCase(word.charAt(0));
                int rowId = map.get(c);
                boolean flag = true;
                for(int idx=1;idx < word.length();idx++){
                    if(map.get(Character.toLowerCase(word.charAt(idx))) != rowId){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    ans.add(word);
                }
            }
        }
        
        return ans.toArray(new String[ans.size()]); 
    }
}