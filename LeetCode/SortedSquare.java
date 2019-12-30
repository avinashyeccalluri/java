package LeetCode;
import java.util.*;
/**
 * SortedSquare
 */
public class SortedSquare {

    public static void main(String[] args) {
        int[] a={-7,-3,2,3,11};
        printArray(sortedSquares1(a));
    }
    public static int[] sortedSquares(int[] A) {
        for(int i=0;i<A.length;i++){
            A[i]=(int)Math.pow(A[i],2);
        } Arrays.sort(A);return A;
    }
    public static void printArray(int[] input){
        for(int i =0;i<input.length;i++){
            System.out.println(input[i]);
        }
    }
    public static int[] sortedSquares1(int[] A) {
        int i = 0, j = A.length -1, k=j;
        int[] B = new int[A.length];
        while(k>=0){
            int x = A[i]*A[i], y = A[j]*A[j];
            if(x >= y){
                B[k] = x;
                i++;
            } else{
                B[k] = y;
                j--;
            }
			k--;
        }
        return B;
    }
}