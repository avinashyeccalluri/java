package CodeWars;

/**
 * IsDigit
 */
public class IsDigit {

  public static void main(String[] args) {
    System.out.println(isDigit("512"));
  }
  public static boolean isDigit(String s) {
    return s.matches("[0-9]+");
    // return s.matches("[a-z_\\d]{4,16}");
  }
}