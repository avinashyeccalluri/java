/**
 * StrignRotation
 */package CodeWars;
public class StrignRotation {

    public static void main(String[] args) {
        System.out.println(shiftLeft("test", "yes"));
        // String a="avinash";
        // System.out.println(a.substring(4,6));
    }
    // public static int shiftLeft(String a, String b) {
    //     int count = a.length() + b.length();
        
    //     for (int i = a.length() - 1, j = b.length() - 1; i >= 0 && j >= 0; i--, j--) {
    //         if (a.charAt(i) != b.charAt(j)) break;
    //         count -= 2;
    //     }
        
    //     return count;
    // }
    public static int shiftLeft(String a, String b) {
        int steps = 0;
        while (!a.equals(b)) {
            if (a.length() > b.length()) {
                a = a.substring(1);
            } else if (b.length() > a.length()) {
                b = b.substring(1);
            } else {
                a = a.substring(1);
                b = b.substring(1);
                steps++;
            }
            steps++;
        }
        return steps;
  }
}