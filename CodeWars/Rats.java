package CodeWars;import java.util.ArrayList;

/**
 * Rats
 */
public class Rats {

    public static void main(String[] args) {
        System.out.println(countDeafRats("~O~OO~~O P"));
    }
    public static int countDeafRats(final String town) {
        int deaf = 0;
        char c;
        boolean p = false;
        
        for (int i = 0; i < town.length(); ++i) {
            c = town.charAt(i);
            if (c == ' ')
                continue;
            if (c == 'P')
                p = true;
            else {
                c = town.charAt(++i);
                if ((!p && c == '~') || (p && c == 'O'))
                    ++deaf;
            }
        }
        return deaf;
      }
}