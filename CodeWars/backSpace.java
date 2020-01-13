package CodeWars;

/**
 * Backspace
 */import java.util.*;
public class backSpace {

    public static void main(String[] args) {
        System.out.println(cleanString("abc#d##c"));
        System.out.println(cleanString1("abc#d##c"));
    }
    // public static String cleanString(String s) {
        public static String cleanString(String s) {
            Stack<String> stack=new Stack<>();
            String a="";
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)!='#'){
                    stack.add(String.valueOf(s.charAt(i))  );
                }else{
                    if(stack.size() >= 1){stack.pop();}
                    else{
                        continue;
                    }
                    
                }
            }for(String sa:stack){
                a+=sa;
            }return a;
          }
          public static String cleanString1(String s) {
            StringBuilder b = new StringBuilder();
            for(int i=0; i<s.length(); ++i) {
              char c = s.charAt(i);
              if(c=='#') b.setLength(Math.max(b.length()-1,0));
              else b.append(c);
            }
            return b.toString();
          }
}
