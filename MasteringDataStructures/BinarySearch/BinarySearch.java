package MasteringDataStructures.BinarySearch;

/**
 * BinarySearch
 */
public class BinarySearch {

    public String iterativeSearch(int[] input,int value){
        int start=0;
        int end=input.length;
        while(start<end){
            int mid=(start+end)/2;
            if(input[mid]==value){
                return "The number is found at the position "+mid;
            }
            else if(input[mid]>value){
                end=mid;
            }else{
                start=mid+1;
            }
        }
        return "The value is not found";
    }

    public int recursiveBinary(int[] input,int value){
        return recursiveBinary(input,0,input.length, value);
    }
    public int recursiveBinary(int[] input,int start,int end,int value){
        if(start>=end){
            return -1;
        }
        int mid=(start+end)/2;
        if(input[mid]==value){
            return mid;
        }else if(input[mid]>value){
            return recursiveBinary(input, 0, mid, value);
        }else{
            return recursiveBinary(input, mid+1, end, value);
        }
    }

}