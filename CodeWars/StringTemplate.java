package CodeWars;

/**
 * StringTemplate
 */
public class StringTemplate {

  public static void main(String[] args) {
    System.out.println(buildString("Cheese","Milk","Chocolate"));
  }
  public static String buildString(String... args)
    { if(args.length==1){
      return "";
    }else{
      String a= "I like "+args[0];
      for(int i=1;i<args.length;i++){
        a+=", "+args[i];
      }return a+"!";
    }
    }
}