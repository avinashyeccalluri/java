/**
 * GetSum
 */
public class GetSum {

    public static void main(String[] args) {
        System.out.println(GetSum(0,-1));
        // intStream.forEach(System.out::println);    
        // System.out.println( IntStream.range(Math.min(0,-1), Math.max(0, -1) + 1).sum());
    }
    public static int GetSum(int a, int b)
     {
        int sum=0;
         if(a<b){        
        for(int i=a;i<=b;i++){
        sum+=i;
        }
    }
    else{
        for(int i=a;i>=b;i--){
            sum+=i;
        }
    }
      return sum;
     }
}