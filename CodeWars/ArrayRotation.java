package CodeWars;
/**
 * ArrayRotation
 */
public class ArrayRotation {

    public static void main(String[] args) {
        int[] intArray=new int[] {1,2,3,4,5,6,7};
        int d=2;
        for(int i=0;i<d;i++){
            int j,temp;
            temp=intArray[0];
            for( j=0;j<intArray.length-1;j++){
                intArray[j]=intArray[j+1];
            }
            intArray[j]=temp;
        }
        for (int i : intArray) {
            System.out.println(i);
        }
        
    }
}