/**
 * Titilecasing
 */package CodeWars;
public class Titilecasing {

    public static void main(String[] args) {
        String a="avinash is in :) php team";
        String b="";
        String c=null;
        System.out.println(toJadenCase(c));
        String d=null;
        // System.out.println(c.length());
        
    }
    public static String toJadenCase(String input){
        try{
        if(input.length()==0  )
            return null;        
        String[] splittedArray=input.split(" ");
        String finalString="";
        for (int i = 0; i < splittedArray.length; i++) {
            if(i!=splittedArray.length-1){
            finalString+=splittedArray[i].substring(0,1).toUpperCase()+splittedArray[i].substring(1).toLowerCase() +" ";}
            else{
                finalString+=splittedArray[i].substring(0,1).toUpperCase()+splittedArray[i].substring(1).toLowerCase();
            }
        }return finalString;}catch(Exception exception){
            return null;
        }
    }
}