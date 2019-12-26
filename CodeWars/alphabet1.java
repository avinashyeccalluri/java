package CodeWars;
/**
 * alphabet1
 */
public class alphabet1 {

    public static void main(String[] args) {
        System.out.println(m1("aaaabbbcccbb"));
        
    }
   static String m1(String str){
        
            int len = str.length();
            char s = str.charAt(0);
            int count=1;
            String result ="";
            for(int i = 1;i < len ;i++){
              
                if(s != str.charAt(i)){
                    result = result+s+count;
                    count=1;
                    s=str.charAt(i);
                }else count++;
            }
             result = result+s+count;
            return result;   
    }
}