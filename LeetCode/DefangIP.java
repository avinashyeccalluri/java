package LeetCode;

/**
 * DefangIP
 */
// Input: address = "1.1.1.1"
// Output: "1[.]1[.]1[.]1"
public class DefangIP {

    public static void main(String[] args) {
        
        System.out.println(defangIPaddr("1.1.1.1"));
        System.out.println(subtractProductAndSum(4421));
    }
    public static String defangIPaddr(String address){
        StringBuilder str=new StringBuilder();
        for(int i=0;i<address.length();i++){
            if(address.charAt(i)=='.'){
                str.append("[.]");
            }else{
                str.append(address.charAt(i));
            }
        }return str.toString();
    }
    public static int subtractProductAndSum(int n) {
        int value=0;
        int product=1;
        int sum=0;
        while(n>0){
            value=n%10;
            n=n/10;
            product*=value;
            sum+=value;
        }return product-sum;
    }
}