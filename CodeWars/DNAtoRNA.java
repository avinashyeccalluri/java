package CodeWars;

/**
 * DNAtoRNA
 */
public class DNAtoRNA {

  public static void main(String[] args) {
    System.out.println(dnaToRna("TTTT"));
  }
  public static String dnaToRna(String dna) {
    return dna.replaceAll("T", "U");
}
}