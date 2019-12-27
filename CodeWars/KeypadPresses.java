/**
 * KeypadPresses
 */package CodeWars;
public class KeypadPresses {

    public static void main(String[] args) {
        //WHERE DO U WANT 2 MEET L8R
        System.out.println(presses("yes"));
    }
    public static int presses(String phrase){
        int nPresses=0;
        String[] keypadWords={"1","ABC2","DEF3","GHI4","JKL5","MNO6","PQRS7","TUV8","WXYZ9","*"," 0","#"};
        char[] someArray= phrase.toUpperCase().toCharArray();
        for(char i: phrase.toUpperCase().toCharArray()){
            for(String j:keypadWords){
                nPresses+=j.indexOf(i)+1;
            }
        }
        return nPresses;
    }

}