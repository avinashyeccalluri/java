/**
 * PhoneNumber
 */
public class PhoneNumber {

  public static void main(String[] args) {
    int[] something={1,2,3,4,5,6,7,8,9,0};
    System.out.println(createPhoneNumber(something));
    System.out.println(formatMethod(something));
    
  }
  public static String createPhoneNumber(int[] numbers) {
    return String.format("(%d%d%d) %d%d%d-%d%d%d%d", java.util.stream.IntStream.of(numbers).boxed().toArray());
  }
  public static String formatMethod(int[] numbers){
    return String.format("(%d%d%d) %d%d%d-%d%d%d%d", numbers[0],numbers[1],numbers[2],numbers[3],numbers[4],numbers[5],numbers[6],numbers[7],numbers[8],numbers[9]);
  }
  public static String createPhoneNumber1(int[] numbers) {
    String phoneNumber = new String("(xxx) xxx-xxxx");    
    for (int i : numbers) {
      phoneNumber = phoneNumber.replaceFirst("x", Integer.toString(i));
    }    
    return phoneNumber;
  }
}