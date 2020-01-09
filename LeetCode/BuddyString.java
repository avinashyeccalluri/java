package LeetCode;

/**
 * BuddyString
 */
public class BuddyString {

    public static void main(String[] args) {
        // System.out.println(buddyStrings("ab","ba"));
        System.out.println(maxNumberOfBalloons("loonbalxbalolpon"));
    }
    public static boolean buddyStrings(String A, String B) {
        StringBuilder str=new StringBuilder(B);
        StringBuilder str1=new StringBuilder(A);
        String b=str1.reverse().toString();
        return str.toString().equals(str1.reverse().toString());
    }
    public static  int maxNumberOfBalloons(String text) {
        if (text == null || text.length() == 0) return 0;
        int ans = Integer.MAX_VALUE;
        int [] map = new int [256];
        for (char c : text.toCharArray()) map [c] ++;
        
        ans = Math.min(ans, map ['b']);
        ans = Math.min(ans, map ['a']);
        ans = Math.min(ans, map ['l']/2);
        ans = Math.min(ans, map ['o']/2);
        ans = Math.min(ans, map ['n']);
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}
