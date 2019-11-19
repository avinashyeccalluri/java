/**
 * DescendingOrder
 */
public class DescendingOrder {

    public static void main(String[] args) {
        System.out.println(sortDesc(123456789));
            

    }
    public static int sortDesc(final int num) {
        String name=String.valueOf(num);
            char[] converted=new char[name.length()];
            for(int i=0;i<name.length();i++){
                converted[i]=name.charAt(i);
            }
            int[] atlast=new int[converted.length];
            for(int i=0;i<converted.length;i++){
                 String something=Character.toString(converted[i]);
                 atlast[i]=Integer.parseInt(something);
            }
            for(int i=atlast.length-1;i>0;i--){
                int largest=0;
                for(int j=1;j<=i;j++){
                    if(atlast[j]<atlast[largest]){
                        largest=j;
                    }                    
                }
                int temp=atlast[largest];
                atlast[largest]=atlast[i];
                atlast[i]=temp;
            }
            StringBuilder strNum=new StringBuilder();
            for(int i:atlast)
            {
                strNum.append(i);
            }
            return Integer.parseInt(strNum.toString());
      }
}