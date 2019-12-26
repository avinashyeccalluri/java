/**
 * Change
 */package CodeWars;
public class Change {

    public static void main(String[] args) {
        // returnChange(16);
        System.out.println(returnChange(31));
        
    }
    static int returnChange(int n ){
        int[] changeValues={1,5,10,25};
        int i=0;
        int j=0;
        int startIndex=changeValues.length-1;
        while(n!=0){if(changeValues[startIndex-i]<=n){
                n=n-changeValues[startIndex-i];
                j++;}else{
                i++;}
        }return j;
    }
}