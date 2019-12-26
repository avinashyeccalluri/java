// import java.util.ArrayList;
package CodeWars;import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
/**
 * FlamesConcept
 */
public class FlamesConcept {

  public static void main(String[] args) {
    System.out.println(josephusSurvivor(7, 3));    
  }
  public static int josephusSurvivor(final int n, final int k) {        
    List<Integer> people = new LinkedList<>();
    for (int i = 1; i <= n; i++) {
        people.add(i);
    }    
    Iterator iter = people.iterator();
    while (people.size() > 1) {
        for (int i = 0; i < k; i++) {
            if (!iter.hasNext()) {
                iter = people.iterator();
            }
            iter.next();
        }
        iter.remove();
    }
    
    return people.get(0);
  } 
}