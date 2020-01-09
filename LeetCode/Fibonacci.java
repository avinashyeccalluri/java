package LeetCode;
import java.util.*;
/**
 * Fibonacci
 */
public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(fib(1));
    }
    public static int fib(int N) {
        // int count=0;
        // if(N==0)return 0;
        // if(N==1) return 1;
        // ArrayList<Integer> arrayList=new ArrayList<Integer>();
        // for(int i=0;i<=N;i++){
        //     arrayList.add(fib1(i));
        // }return arrayList.get(N-1)+arrayList.get(N-2);
        if(N == 0) return 0;
        if(N == 1) return 1;

    int x2 = 0;
    int x1 = 1;
    int xn = 0;
    
    for(int i = 2; i <= N; i++)
    {
        xn = x1 + x2;
        x2 = x1;
        x1 = xn;
    }
    
    return xn;      
    }
    public static int fib1(int n){
        if(n<=-1){
            return -1;
        }if(n<=1){
            return n;
        }
        else{
             return fib1(n-1)+fib1(n-2);
        }
    }

}
