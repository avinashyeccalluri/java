/**
 * SmokingTimmy
 */package CodeWars;
public class SmokingTimmy {

    public static void main(String[] args) {
        System.out.println(startSmoking(10, 2));
    }
    public static int startSmoking(int bars,int boxes){
        return (bars*180)+(boxes*18) +(((bars*180)+(boxes*18)-5)/4)+1;        
      }
}