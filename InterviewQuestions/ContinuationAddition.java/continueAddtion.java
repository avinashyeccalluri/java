import java.util.Scanner;

/**
 * continueAddtion
 */
public class continueAddtion {
    public static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the array size");
        int a=input.nextInt();
        int[] outputArray=new int[a+1];
        input.nextLine();
        System.out.println("Enter the no.of iterations");
        int b=input.nextInt();
        input.nextLine();
        int iterations=0;
        while(iterations<3){
            iterations++;
            System.out.println("Enter the start index");
            int startIndex=input.nextInt();
            input.nextLine();
            System.out.println("Enter the end index");
            int endIndex=input.nextInt();
            System.out.println("Enter the increment value");
            int k=input.nextInt();
            input.nextLine();
            for(int i=(startIndex-1);i<endIndex;i++){

            }
        }
    }
}