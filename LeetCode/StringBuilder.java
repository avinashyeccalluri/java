package LeetCode;

/**
 * StringBuilder
 */
public class StringBuilder {

    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }
    public static String reverseWords(String s) {
         
         String[] result=s.split(" ");
         String last="";
         for(int i=result.length-1;i>=0;i--){
             last+=result[i]+" ";
         }
         last=last.trim();
         StringBuffer stringBuffer=new StringBuffer(last);
         return stringBuffer.reverse().toString();
    }
}
