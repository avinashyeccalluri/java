package Practising; import java.util.Scanner;
class MaxandMin{
  public static void main(String... args){
    Scanner input= new Scanner(System.in);
    System.out.println("Enter the number of entries");    
    int n=input.nextInt();
    input.nextLine();
    int[] b=new int[n];
    for(int i=0;i<n;i++){
      System.out.println("Enter the "+(i+1)+"nd"+" value");
      b[i]=input.nextInt();
      input.nextLine();
    }
    int max=Integer.MAX_VALUE;
    for(int j=0;j<b.length;j++){
      if(b[j]<max){
        max=b[j];
      }
    }
    System.out.println(max);
  }
}