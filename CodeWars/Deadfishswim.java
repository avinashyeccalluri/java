/**
 * Deadfishswim
 */
import java.lang.*; 
public class Deadfishswim {

    public static void main(String[] args) {
        String name="iiisdoso";
        char[] a= name.toCharArray();
        int count=0;
        System.out.println(a.length);
        for(int i=0;i<a.length;i++){
            // System.out.println(a[i]);
            if(a[i]=='o'){
                count++;
                System.out.println(a[i]);
            }
        }
        System.out.println(count);
        int[] b=new int[count];
        int initial=0;
        for(int j=0;j<b.length;j++){
            switch(a[0]){
                case 'i':
                 count++;
                 break;
                 case 's':
                 count=(int) Math.pow(initial,2);
                 break;
                 case 'd':
                 count--;
                 break;
                 default:
                 b[initial]=count;
                 initial++;

            }
        }
        for (int i : b) {
            System.out.println(i);
        }
    }
}