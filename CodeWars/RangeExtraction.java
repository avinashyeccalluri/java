/**
 * RangeExtraction
 */import java.util.*;
public class RangeExtraction {

    public static void main(String[] args) {
        System.out.println(rangeExtraction(new int[] {-6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20}));
    }
    public static String rangeExtraction(int[] arr) {
        String result="";boolean flag=true;int count=0;int temp=0;boolean something=false;;
        for(int i=0;i<arr.length-1;i++){
            int a=arr[i];
            int b=arr[i+1]-1;
            if(flag){
                 temp=arr[i];
            }
            if(arr[i]!=arr[i+1]-1){
                if(count>=2 && something) result+=arr[i];
                if(something){
                result+="-"+arr[i+1];i+=2;}
                else{
                    result+=arr[i];
                }
                flag=true;
                something=false;
            }
            
            else if(arr[i]==arr[i+1]-1){
                count++;
                if(flag){
                    result+=String.valueOf(temp);
                }
                flag=false;  
                something=true;           
            }
            // if(count>=2 && flag){
            //     result+=-arr[i];
            // }
        }return result;
    }
}