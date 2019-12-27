/**
 * StrongestEven
 */package CodeWars;
public class StrongestEven {

    public static void main(String[] args) {
        strongestEven(5,10);
        System.out.println(strongestEven(0,0));
    }
    public static int strongestEven(int n, int m) {
        int largest=Integer.MIN_VALUE;
        int returningDigit=0;
        int count;
        for(int i=n;i<=m;i++){
            count=0;
            int temp=i;            
            while(temp%2==0){
                temp/=2;
                count++;                
            }
            if(count>largest){
                largest=count;
                returningDigit=i;
            }
        }
        return returningDigit;
    }
}