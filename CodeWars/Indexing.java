/**
 * Indexing
 */
public class Indexing {

    public static void main(String[] args) {
        int[] a={-5, -1, 2, 4};
        System.out.println(extendingHelp(a));
        
    }
    static int helper(int low,int high,int[] input){
        if(low==high){
            return -1;
        }
        int mid=(low+high)/2;
        if(input[mid]==mid){
            return mid;
        }else if(input[mid]<mid){
            return helper(mid+1, high, input);
        }return helper(low,mid,input);
    }
    static int extendingHelp(int[] input){
        return helper(0, input.length, input);
    }
}