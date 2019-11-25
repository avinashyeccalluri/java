/**
 * SumEqualsInAArray
 */
public class SumEqualsInAArray {
  public static void main(String[] args) {
    prinArray(givingAnswer(9));
  }
  public static int[] givingAnswer(int k){
    int[] givenArray={1,2,3,4,5,6,7};
    int low=0;
    int high=givenArray.length-1;
    while((givenArray[low]+givenArray[high])!=k){
    if((givenArray[low]+givenArray[high])<k){
      low++;
    }
    else if((givenArray[low]+givenArray[high])>k){
      high--;
    }}
      return new int[] {givenArray[low],givenArray[high]};    
  }
  public static void prinArray(int[] a){
    for (int i : a) {
      System.out.println(i);
    }
  }
}