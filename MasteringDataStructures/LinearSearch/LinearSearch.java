package MasteringDataStructures.LinearSearch;

/**
 * LinearSearch
 */
public class LinearSearch {

    public int linerSearch(int[] input,int value){
        for(int i:input){
            if(i==value){
                return i;
            }           
        }return -1;
    }
}