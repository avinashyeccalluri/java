/**
 * HomeNumbers
 */
public class HomeNumbers {

    public static void main(String[] args) {
        int[] a={5, 1, 2, 3, 0, 1, 5, 0, 2};
        System.out.println(houseNumbersSum(a));
    }
    public static int houseNumbersSum(final int[] arr) {
        int finalSum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                return finalSum;
            }finalSum+=arr[i];
        }
        return 0; //coding and coding..
    }
}