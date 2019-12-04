/**
 * PlantGrowth
 */
public class PlantGrowth {

  public static void main(String[] args) {
    System.out.println(growingPlant(100, 10, 910));
    System.out.println("hello");
    
  }
  public static int growingPlant(int upSpeed, int downSpeed, int desiredHeight) {
    int grownHeight=0;
    int count=0;
    while(grownHeight!=desiredHeight){
      count++;
      int initialDay=upSpeed;
      grownHeight=upSpeed-downSpeed;
    }
    return count;
}
}