package CodeWars;

/**
 * SkiJump
 */
public class SkiJump {

  public static void main(String[] args) {
    String[] a={"*","**","***","****","*****"};
    System.out.println(Skijump(a));
  }
  static String Skijump(String[] input){
    int a=input.length;
    double jumpLength=(a*a*1.5*9)/10;
    if(jumpLength<10){
      return "He's Crap";
    }else if(jumpLength>10 && jumpLength<25){
    return "ok";}
    else if(jumpLength> 10 && jumpLength< 50){
      return "He's flying";
    }return "Gold";
  }
}