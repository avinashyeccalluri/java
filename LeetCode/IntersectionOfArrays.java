/**
 * IntersectionOfArrays
 */import java.security.KeyStore.Entry;
import java.util.*;
public class IntersectionOfArrays {

    public static void main(String[] args) {
        printArray(intersection(new int[] {4,9,5}, new int[] {9,4,9,8,4}));
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set =new HashSet();
        List<Integer> arraylist=new ArrayList<>();int j =0;
        for(int i :nums1){
            set.add(i);
        }
        for(int i :nums2){
            boolean temp=arraylist.contains(i);
            if(set.contains(i) && arraylist.contains(i)==false){
            arraylist.add(i);}
        }int[] arr = new int[set.size()];
            for(int i :set){
                arr[j++]=i;
            }return arr;
        

    }
    public static void printArray(int[] input){
        for(int i:input){
            System.out.println(i);
        }
    }
}