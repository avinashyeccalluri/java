/**
 * UnderstandingConstructor
 */
class Account{
  int a;
  int b;
  int e;
  int f;
  public void setData(int c,int d){
    
      a=c;
      if(d==10){
        b=d;
      }
      else{
        b=20;
      }
      
  }
  public void showData(){
    System.out.println("the value of a "+a);
    System.out.println("the value of b "+b);
  }
}
public class UnderstandingConstructor {
public static void main(String[] args) {
  Account obj=new Account();
  obj.setData(20, 30);
  obj.showData();
}  
}