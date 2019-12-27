package LeetCode;

/**
 * ReversingArray
 */
public class ReversingArray {

  public static void main(String[] args) {
    String[] a ={"h","e","l","l","o"};
    reverseString(a);

  }
  public static void reverseString(String[] a) {
    int mid=a.length/2;
    for(int i=0;i<mid;i++){
        String temp=a[i];
        a[i]=a[a.length-1-i];
        a[a.length-1-i]=temp;
    }
    for(String c:a){
      System.out.println(c);
    }
    
}
}