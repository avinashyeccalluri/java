package LeetCode;

/**
 * JudgeCircle
 */
public class JudgeCircle {

  public static void main(String[] args) {
    System.out.println(judgeCircle("LR"));
  }
  public static boolean judgeCircle(String moves) {
        char[] directions=moves.toCharArray();
        int vertical=0;
        int horizontal=0;
        for(char c:directions){
          if(c=='U'){
            vertical+=1;
          }else if(c=='D'){
            vertical-=1;
          }else if(c=='L'){
            horizontal+=1;
          }else{
            horizontal-=1;
          }
        }return (vertical==0 && horizontal==0);
  }
}