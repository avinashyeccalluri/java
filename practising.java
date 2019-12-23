/**
 * practising
 * https://www.codewars.com/kata/search/java?q=&r%5B%5D=-8&tags=Strings&beta=false
//  */
// s1 = "6900690040"
// s2 = "4690606946"
// s3 = "9990494604"
public class practising {

  public static void main(String[] args) {
    System.out.println(abbrevName("Avinash Yeccalluri"));
  }
  public static String abbrevName(String name) {
    // name=name.toUpperCase();
    String[] a=name.split(" ");
    return (a[0].charAt(0) +"."+a[1].charAt(0)).toUpperCase();
  }
}