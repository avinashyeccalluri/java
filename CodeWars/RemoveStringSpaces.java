/**
 * RemoveStringSpaces
 */
public class RemoveStringSpaces {

    public static void main(String[] args) {
        String a="8 j 8   mBliB8g  imjB8B8  jl  B";
        System.out.println(noSpace(a));
    }
    static String noSpace(final String x) {
        String[] a=x.split(" ");
        String concatedString="";
        for (String string : a) {
            concatedString+=string;
        }
        return concatedString;
    }
}