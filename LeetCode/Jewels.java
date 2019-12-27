package LeetCode;

/**
 * Jewels
 */
public class Jewels {

    public static void main(String[] args) {
        String J = "z";String S = "ZZZZ";
        System.out.println(numJewelsInStones(J, S));
    }
    public static int numJewelsInStones(String J, String S) {
        char[] a=J.toCharArray();
        char[] b=S.toCharArray();
        int count=0;
        for(char i:a){
            for(char j:b){
                if(i==j){
                    count++;
                }
            }
        }return count;
    }
}