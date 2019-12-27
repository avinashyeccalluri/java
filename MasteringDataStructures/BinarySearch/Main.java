package MasteringDataStructures.BinarySearch;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        BinarySearch binarySearch=new BinarySearch();
        // System.out.println(binarySearch.iterativeSearch(new int[] {1,2,3,4,5,6}, 6));
        System.out.println(binarySearch.recursiveBinary(new int[] {1,2,3,4,5,6}, 2));
    }
}