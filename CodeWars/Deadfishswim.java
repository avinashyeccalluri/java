/**
 * Deadfishswim
 */
import java.lang.*; 
public class Deadfishswim {

    public static void main(String[] args) {

        printArray(parse("iiisdosodddddiso"));
    }

public static int[] parse(String data) {
    char[] a= data.toCharArray();
    int count=0;
    for(int i=0;i<a.length;i++){
        if(a[i]=='o'){
            count++;
        }
    }
    int[] b=new int[count];
    int initial=0;
    int value=0;
    boolean flag=true;
    for (int j = 0; j < a.length; j++) {
        if(a[j]=='i'){
            value++;
        }
        else if(a[j]=='d'){
            value--;
        }else if(a[j]=='s'){
            value=(int) Math.pow(value,2);
        }else{
            b[initial]=value;
            initial++;
        }
    }

    return b;
}
public static void printArray(int[] as){
    for(int i:as){
        System.out.println(i);
    }
}
}