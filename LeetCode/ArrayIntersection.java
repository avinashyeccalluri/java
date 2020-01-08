package LeetCode;
import java.util.*;
/**
 * ArrayIntersection
 */
public class ArrayIntersection {

    public static void main(String[] args) {
        printArray(intersect( new int[] {1,2,2,1} ,new int[] {2,2}));
    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int l1=nums1.length;
        int l2=nums2.length;
        int l3=l1>l2 ? l1:l2;
        int[] res=new int[l3];
        int k=0; int i=0; int j=0;
        while(i<l1 && j <l2){
            if(nums1[i]==nums2[j]){
                res[k]=nums1[i];
                k++;i++;j++;
            }else{
                if(nums1[i]>nums2[j]){
                    j++;
                }else{
                    i++;
                }
            }
        }
        int[] resArray=Arrays.copyOf(res, k);
        return resArray;
    
    }
    public static void printArray(int[] input){
        for (int i : input) {
            System.out.println(i);
        }
    }
}