/**
 * practising
 */
public class practising {

  public static void main(String[] args) {
    // System.out.println(Digits(9876543210l));
    int[] a={8,6,10};
    int[] b={8,6,10};
    printArray(Digits(a, b));
  }
  public static int[] Digits(int[] input1,int[] input2) {
    int a_score=0;
    int b_score=0;
    if(input1.length!=input2.length){
      return new int[] {0,0};
    }
    for(int i=0;i<input1.length;i++){
      if(input1[i]>input2[i]){
        a_score++;
      }else if(input1[i]<input2[i]){
        b_score++;
      }
    }return new int[] {a_score,b_score};
  }
  public static void printArray(int[] input){
    for (int i : input) {
      System.out.println(i);
    }
  }
}