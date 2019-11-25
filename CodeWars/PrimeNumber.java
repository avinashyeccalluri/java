import java.util.*;
/**
 * PrimeNumber
 */
public class PrimeNumber {
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the last number till where you want to find the prime number");
        int lastNumber=input.nextInt();
        input.nextLine();
        boolean flag=true;
        for(int i=2;i<lastNumber;i++){
            for(int j=2;j<i;j++){
                if(i==2){
                    System.out.println(i);
                }
                else if(i%j==0){
                   flag=false;
                }
            }if(flag){
                System.out.println(i);
            }else{
                flag=true;
            }
        }
        
    }
}