package Practising;
/**
 * practising
//  */
// public static void main(String[] args) {
//     int[] intArray={20,35,-15,7,55,1,-22};
//     for(int firstUnsortedIndex=1;firstUnsortedIndex<intArray.length;firstUnsortedIndex++){
//       int newElement=intArray[firstUnsortedIndex];
//       int j;
//           for(j=firstUnsortedIndex;j>0 && intArray[j-1]>newElement;j--){
//         intArray[j]=intArray[j-1];
//       }
//       intArray[j]=newElement;
//     }
//     for(int i:intArray){
//       System.out.println(i);
//     }

//   }
public class practising {

    public static void main(String[] args) {
        int[] intArray={20,35,-15,7,55,1,-22};
        for(int i =1;i<intArray.length;i++){
            int newElement=intArray[i];
            int j;
            for(j=i;j>0 && intArray[j-1]>newElement;j--){
                intArray[j]=intArray[j-1];
            }intArray[j]=newElement;
        }for(int i:intArray){
                  System.out.println(i);
                }
    }
}