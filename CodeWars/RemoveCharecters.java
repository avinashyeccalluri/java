package CodeWars;

/**
 * RemoveCharecters
 */
public class RemoveCharecters {

  public static void main(String[] args) {
    String a="eloquent";
    System.out.println(remove(a));
  }
  public static String remove(String str) {

    return str.substring(1,str.length()-1);
}
}