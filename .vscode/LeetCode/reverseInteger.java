/**
 * reverseInteger
 */
public class reverseInteger {

    public static void main(String[] args) {
        System.out.println(reverse(1234));
    }
    public static int reverse(int x) {
        String a="";
        while(x/10>0){
            a+=x%10;
            x=x/10;
            System.out.println("hello");
            
        }
        return Integer.valueOf(a);
    }
}