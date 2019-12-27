/**
 * SpeedControl
 */package CodeWars;
public class SpeedControl {

    public static void main(String[] args) {
        double[] ab={};
        System.out.println( gps(20,ab));
    }
    public static int gps(int s, double[] x)
    {
        if(x.length>1){
            double something=Integer.MIN_VALUE;
            double[] y=new double[x.length-1];        
            for(int i =0;i<x.length-1;i++){
                y[i]=((x[i+1]-x[i])*3600)/s;
                if(y[i]>something){
                    something=y[i];
                }
            }
            return((int)something);
        } return 0;           
        }      
    }
