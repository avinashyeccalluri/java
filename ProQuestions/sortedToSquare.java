package ProQuestions;

import java.util.ArrayList;
import java.util.List;

import javax.sound.midi.Soundbank;

/**
 * sortedToSquare
 */
public class sortedToSquare {

  public static void main(String[] args) {
    int[] a={-5, -3, -2, 0, 1, 4, 5};
    printArrayList(sortedProMethod(a));
    
  }
  public static ArrayList<Integer> sortedProMethod(int[] input){
    ArrayList<Integer> list=new ArrayList<>();
    ArrayList<Integer> result=new ArrayList<>();
    for (int i : input) {
      if(i<0){
          list.add(i);
          continue;
      }
      int c=list.size();
      int b=-list.get(list.size()-1);      
      while(list.size()>0 && -list.get(list.size()-1)<=i){
        result.add((int) Math.pow(list.get(list.size()-1),2));
        list.remove(list.size()-1);
      }
      result.add((int)Math.pow(i,2));
    }
    return result;
  }
  
  public static void printArray(int[] array){
    for (int i : array) {
      System.out.println(i);
    }
  }
  public static void printArrayList(ArrayList<Integer> input){
    for (Integer integer : input) {
      System.out.println(integer);
    }
  }
  
}