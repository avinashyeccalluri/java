/**
 * MergeSort
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] array={5,4,3,2,1};
        printArray(array);
        array=mergeSort(array);
        System.out.println("sorted array");
        printArray(array);
    }
    public static int[] mergeSort(int[] sortingArray){
        if (sortingArray.length==1){
            return sortingArray;
        }
        int midpoint=sortingArray.length/2;
        int[] left=new int[midpoint];
        int[] right;
        if(sortingArray.length %2 ==0){
             right=new int[midpoint];
        }else{
             right=new int[midpoint+1];
        }
        for(int i=0;i<midpoint;i++){
            left[i]=sortingArray[i];
        }
        for(int j=0;j<right.length;j++){
            right[j]=sortingArray[midpoint+j];
        }
        int[] result=new int[sortingArray.length];
        left=mergeSort(left);
        right=mergeSort(right);
        result=merge(left,right);
        return result;        
    }
    private static int[] merge(int[] left,int[] right){
        int[] result=new int[left.length+right.length];
        int leftPointer,rigthPointer,resultPointer;
        leftPointer=rigthPointer=resultPointer=0;
        while(leftPointer<left.length || rigthPointer <right.length){
            if(leftPointer<left.length && rigthPointer<right.length){
                if(left[leftPointer]<right[rigthPointer]){
                    result[resultPointer++]=left[leftPointer++];
                }else{
                    result[resultPointer++]=right[rigthPointer++];
                }
            }else if(leftPointer<left.length){
                result[resultPointer++]= left[leftPointer++];
            }else if(rigthPointer<right.length){
                result[resultPointer++]=right[rigthPointer++];
            }
        }return result;

    }
    public static void printArray(int[] givenArray){
        for (int i : givenArray) {
            System.out.println(i);
        }
    }
}