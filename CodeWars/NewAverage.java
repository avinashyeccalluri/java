/**
 * NewAverage
 */
public class NewAverage {

    public static void main(String[] args) {
        double[] a = new double[] {14, 30, 5, 7, 9, 11, 15};
        System.out.println(newAvg(a, 2)); 
    }
    public static long newAvg(double[] arr, double navg)
    {  
         double sum=0;
        int length=arr.length+1;
        for(double i:arr){
            sum+=i;
        }
       double result= (double)((navg*length)-sum);
    //    return Math.round(Math.ceil(result));
        if(result>1){
            return Math.round(result);
        } throw new IllegalArgumentException();
    }
}