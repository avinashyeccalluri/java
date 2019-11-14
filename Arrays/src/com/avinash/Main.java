package com.avinash;

import java.util.Scanner;

public class Main {
    private static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the size of the array");
        int size=input.nextInt();
        input.nextLine();
        int[] gotarray=getarraysize(size);
        int[] sortedarray=getorderedarray(gotarray);
        for (int i:sortedarray){
            System.out.println(i);
        }
    }
    public static int[] getarraysize(int something){
            int[] somearray=new int[something];
            for(int i=0;i<somearray.length;i++){
                System.out.println("Enter the "+i+ "element \r");
                somearray[i]=input.nextInt();
            }
            return somearray;
    }
    public static int[] getorderedarray(int[] somearray){
        int temp = 0;
        boolean flag=true;
        while(flag) {
            flag=false;
            for (int i = 0; i < somearray.length - 1; i++) {
                if (somearray[i] < somearray[i + 1]) {
                    temp = somearray[i];
                    somearray[i] = somearray[i + 1];
                    somearray[i + 1] = temp;
                    flag=true;
                }
            }
        }return somearray;
    }
}
