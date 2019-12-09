/**
 * WellofIdeas 
 */
public class WellofIdeas  {

    public static void main(String[] args) {
      String[] a={"good", "bad", "bad", "bad", "bad"};
      well(a);
      System.out.println(well(a));
        
    }
    public static String well(String[] x) {
      int j=0;
        for(int i=0;i<x.length;i++){
          if(x[i].toLowerCase()=="good"){
              j+=1;
          }
        }
        if(j>0 && j<=2){
          return "Publish";
        }else if(j>=3){
          return "I smell a series!";
        }
        return "Fail!";
      }
}