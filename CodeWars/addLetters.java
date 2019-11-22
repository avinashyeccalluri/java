
/**
 * Test
 */
public class Test {

    public static void main(String[] args) {
        // int ascii='a';
        // ascii-=96;
        // int b=6;
        // int a=97+5;
        // String name=" ";
        
        // char something=name.charAt(0);
        // System.out.println(something);
        // char c= (char) a;
        // System.out.println(c);
        // System.out.println
        System.out.println(addLetters());
        
    } 
    public static String addLetters(String... letters) {
        int a=0;
        if(letters.length==0){ 
            return "z";
        }else{
            for(String i:letters){

                    char convertedLetter=i.charAt(0);
                    int convertedNumber=(int) convertedLetter-96;
                    a+=convertedNumber;}                                
            }
            if(a>26){
                a-=26;
            }
            int lastvalue=a+96;
            char ascii= (char) lastvalue;
            return Character.toString(ascii);
        }
        
    }



