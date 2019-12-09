package InterviewQuestions.Zoho;

/**
 * Skipsorting
 */
public class Skipsorting {

    public static void main(String[] args) {
        int[] a={13,2 4,15,12,10,5};
        for(int i=0;i<a.length-1;i+=2){
            if(a[i]>a[i+1]){
                int temp=a[i];
                a[i]=a[i+1];
                a[i+1]=temp;
            }
        }
        for(int i=1;i<a.length-1;i+=2){
            if(a[i]<a[i+1]){
                int temp=a[i];
                a[i]=a[i+1];
                a[i+1]=temp;
            }
        }for (int i : a) {
            System.out.println(i);
            
        }
    }
}