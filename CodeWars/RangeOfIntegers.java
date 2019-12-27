/**
 * RangeOfIntegers
 */package CodeWars;
public class RangeOfIntegers {
    // generateRange(2, 10, 2) // should return array of [2,4,6,8,10]
    public static void main(String[] args) {
        
    }
    public static int[] generateRage(int srt,int end,int skip){
        int[] generatedNumber=new int[skip/2];
        for(int i=srt;i<=end;i+=skip){
            int j=-1; j++;
            generatedNumber[j]=i;
        }
        return generatedNumber;
    }
    public static void printArray(int[] someArray){
        for (int i = 0; i < someArray.length; i++) {
            System.out.println(someArray[i]);
        }
    }
}