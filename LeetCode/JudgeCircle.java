package LeetCode;

/**
 * JudgeCircle
 */
public class JudgeCircle {

  public static void main(String[] args) {
    System.out.println(judgeCircle("LRR"));
  }
  public static boolean judgeCircle(String moves) {
        char[] directions=moves.toCharArray();
        int vertical=0;
        int horizontal=0;
        for(char c:directions){
          switch(c){
            case 'U':
            vertical++;
            break;
            case 'D':
            vertical--;break;
            case 'L':
            horizontal++;break;
            case 'R':
            horizontal--;break;
          }
        }return (vertical==0 && horizontal==0);
  }
}