/**
 * Test
 */
public class AllInOne {

    public static void main(String[] args) {
        int[] intArray1={20,35,-15,7,55,1,-22};
        // printarray(BubbleSort(intArray1));
        // printarray(InsertionSort(intArray1));
        printarray(SelctionSort(intArray1));        
    }
    public static void printarray(int[] something){
        for (int i : something) {
            System.out.println(i);            
        }
    }
    //-------------------------------------------------------------------
    public static int[] InsertionSort(int[] intArray1){
        for(int i=1;i<intArray1.length;i++){
            int newElement=intArray1[i];
            int j;
            for( j=i;j>0 && intArray1[j-1]>newElement;j--){
                intArray1[j]=intArray1[j-1];                
            }
            intArray1[j]=newElement;
        }return intArray1;
    }
    //-------------------------------------------------------------------
    public static int[] SelctionSort(int[] intarray2){
        for(int lastUnsortedIndex=intarray2.length-1;lastUnsortedIndex>0;lastUnsortedIndex--){
            int largest=0;
            for(int i=1;i<=lastUnsortedIndex;i++){
              if(intarray2[i]>intarray2[largest]){
                largest=i;
              }
            }
            swap(intarray2, largest, lastUnsortedIndex);
          }
        return intarray2;
    }
    //-------------------------------------------------------------------
    public static int[] BubbleSort(int[] intArray){
        for(int i=intArray.length-1;i>0;i--){
            for(int j=0;j<i;j++){
                if(intArray[j]>intArray[j+1]){
                    int temp=intArray[j];
                    intArray[j]=intArray[j+1];
                    intArray[j+1]=temp;
                }
            }
        }
        return intArray;
    }
    public static void swap(int[] array,int i,int j){    
        if (i==j) {
          return;
        }
          int temp=array[i];
          array[i]=array[j];
          array[j]=temp;    
      }
}