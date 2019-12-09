/**
 * StringComparison
 */
public class StringComparison {

    public static void main(String[] args) {
        String a="what time are we climbing up the volcano";
        String[] b=a.split(" ");
        for(int i=b.length-1;i>0;i--){
            for(int j=0;j<i;j++){
                if((b[j].substring(b[j].length()-1)).compareTo(b[j+1].substring(b[j+1].length()-1))>0){
                    String temp=b[j];
                    b[j]=b[j+1];
                    b[j+1]=temp;
                }
            }
        }printArray(b);
    }public static void printArray(String[] input){ 
        for (String string : input) {
            System.out.print(string+" ");
        }
    }
}