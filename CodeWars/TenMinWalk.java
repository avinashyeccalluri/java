package CodeWars;import java.util.ArrayList;
import java.util.Collections;

/**
 * TenMinWalk
 */
public class TenMinWalk {

    public static void main(String[] args) {
        System.out.println(isValid(new char[] {'n','s','n','s','n','s','n','s','n','s'}));
    }
    public static boolean isValid(char[] walk) {
        if(walk.length!=10){
            return false;
        }
        int vertical=0;int horizontal=0;
        for (char c : walk) {
            if(c=='n'){
                vertical+=1;
            }else if(c=='s'){
                vertical-=1;
            }else if(c=='e'){
                horizontal+=1;
            }else{
                horizontal-=1;
            }
        }
        return(vertical==0 && horizontal ==0);

        
      }
    
}