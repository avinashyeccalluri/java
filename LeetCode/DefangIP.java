package LeetCode;

/**
 * DefangIP
 */
// Input: address = "1.1.1.1"
// Output: "1[.]1[.]1[.]1"
public class DefangIP {

    public static void main(String[] args) {
        
        System.out.println(defangIPaddr("1.1.1.1"));
    }
    public static String defangIPaddr(String address) {
        String b="";
        String[] a=address.split("\\.");
        for(int i =0 ;i < a.length;i++){
            if(i==a.length-1){
                b+=a[i];
            }else{
                b+=a[i]+"[.]";
            }
        }return b;
    }
}