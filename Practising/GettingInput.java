import java.util.Scanner;
class GettingInput{
  public static void main(String... args){
    Scanner input=new Scanner(System.in);
    System.out.println("Enter your year of birth");
    boolean hasnextint=input.hasNextInt();
    if(hasnextint){
      int age=input.nextInt();
      input.nextLine();
      System.out.println("Enter your name");
      String name=input.nextLine();
      int finalage=2018-age;
      if(finalage<=0 && finalage<=101){
        System.out.println("The entered date is a invalid date");
      }else{
      System.out.println("Your name is "+name+" "+finalage);
      }
    }else{
      System.out.println("Unable to parse integer");
    }
  }
}