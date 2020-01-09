package LeetCode;
import java.util.*;

/**
 * lastStoneWeight
 */
public class lastStoneWeight {

    public static void main(String[] args) {
        System.out.println(lastStoneWeight(new int[] {2,7,4,1,8,1}));
    }
    public static int lastStoneWeight(int[] stones) {
        Arrays.sort(stones);
        if(stones.length==1){
            return stones[0];
        }
        for(int i=stones.length-1;i>=0;i--){
            int j=i-1;
            if(i==0){
                return stones[0];
            }
            stones[j]=stones[i]-stones[j];
            Arrays.sort(stones);
        }return -1;

        }
    }
