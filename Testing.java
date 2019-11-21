import java.util.ArrayList;

/**
 * Testing
 */
public class Testing {

    public static void main(String[] args) {
        int a[] ={ 1, 2, 3, 1, 1, 2, 1, 2, 3, 3, 2, 4, 5, 3, 1 };
        int n=3;
        printArray(deleteNth(a,n));

    }
    public static int[] deleteNth(int arr[],int n)
    {
        ArrayList<Integer> a=new ArrayList<>();
        int counter=0;
        if(n==1){
            n=1;
        }else{
            n+=1;
        }       
        for(int i=0;i<arr.length;i++){
            int j;
            for( j=0;j<i;j++)
            
                if(arr[i]==arr[j])
                    counter++;            
            if(counter>=n){
                counter=0;
                continue; }
            if(i==j){
                a.add(arr[i]);
            }            
        }
        Object[] objects = a.toArray();
        int[] ret=new int[a.size()];
        for(int i=0;i< ret.length;i++){
            ret[i]=a.get(i).intValue();
        }
        return ret;
    }
    public static void printArray(int[] a){
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

    }
}   