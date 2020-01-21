/**
 * tribonacci
 */package Leetcode;
public class tribonacci {

    public static void main(String[] args) {
        System.out.println(tribonacci(10));
    }
    public static int tribonacci(int n) {
        if(n <= 1) return n;
        
        int t0 = 0;
        int t1 = 1;
        int t2 = 1;
        
        for(int i = 3; i <= n; i++){
            int tmp = t0 + t1 + t2;
            t0 = t1;
            t1 = t2;
            t2 = tmp;
        }
        
        return t2;
    }
}