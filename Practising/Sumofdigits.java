package Practising;
class Sumofdigits{
  public static void main(String[] args){
    System.out.println("The output for the given number is "+sumDigits(23));
  }
  private static int sumDigits(int number){
    if(number<9){
      return -1;
    }
    int sum=0;
    while(number>0){
      sum+=number%10;
      number=number/10;
    }
    return sum;
  }
}