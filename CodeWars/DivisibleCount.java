/**
 * DivisibleCount
 */package CodeWars;
public class DivisibleCount {

    public static void main(String[] args) {
        System.out.println(findNb(1071225));
    }
    public static long findNb(long m) {
        long total = 0;
    int counter = 0;
    
    while (total < m) {    
      counter++;  
      total = total + (long) Math.pow(counter, 3);            
    }    
    if (m == total)
      return counter;
    return -1;
      } 

}