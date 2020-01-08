package LeetCode;

/**
 * BuddyString
 */
public class BuddyString {

    public static void main(String[] args) {
        System.out.println(buddyStrings("ab","ba"));
    }
    public static boolean buddyStrings(String A, String B) {
        StringBuilder str=new StringBuilder(B);
        StringBuilder str1=new StringBuilder(A);
        String b=str1.reverse().toString();
        return str.toString().equals(str1.reverse().toString());
    }
}
