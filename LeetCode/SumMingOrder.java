package LeetCode;
import java.util.*;
/**
 * SumMingOrder
 */
public class SumMingOrder {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>(); 
        int[] temp=new int[2];int k=0;
          String a="[+-//*/]";
          int result=0;
          Object[] something={5,4,'+'};
            for(int i=0;i<something.length;i++){
             if((String.valueOf(something[i]) ).matches(a)){
              String choice =String.valueOf(something[i]);
                for(int j=0;j<2;j++){
                    temp[k]=(int) stack.pop();
                    k++;
                  }
                    switch(choice){
                      case "+":
                        result+=temp[1]+temp[0];
                        break;
                      case "-":
                        result+=temp[1]-temp[0];
                        break;
                      case "*":
                        result+=temp[1]*temp[0];
                        break;
                      case "/":
                        result+=temp[1]/temp[0];
                        break;
                    }              
                stack.push(result);result=0;k=0;            
             }else{
               stack.push((int)something[i]);
             }
            }
          System.out.println(stack.peek());
    
      }
}