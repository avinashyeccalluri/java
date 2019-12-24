/**
 * Order
 */
public class Order {

    public static void main(String[] args) {
        System.out.println(order("4of Fo1r pe6ople g3ood th5e the2"));
    }
    public static String order(String words) {
        if(words==""){
            return "";
        }
        String[] a=words.split(" ");
        String result="";
        String[] b=new String[a.length];
        for(int i=0;i<a.length;i++){
            String number=a[i].replaceAll("[^0-9]", "");
            b[(Integer.parseInt(number))-1]=a[i];
        }
        for (String string : b) {
            result+=string+" ";
        }return result.trim();
      }
}