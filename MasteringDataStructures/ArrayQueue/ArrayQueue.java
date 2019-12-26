package MasteringDataStructures.ArrayQueue;

import java.util.EmptyStackException;

/**
 * ArrayQueue
 */
public class ArrayQueue {
  int[] queue;
  int start;
  int end;
  int size;

  public ArrayQueue(){
    queue=new int[10];
  }

  public void add(int data){
    if(size==queue.length){
      int[] newArray=new int[2*queue.length];
      System.arraycopy(queue, 0, newArray, 0, queue.length);
      queue=newArray;
    }
    queue[end]=data;
    end++;
  }
  public int size(){
    return end-size;
  }
  public boolean isEmpty(){
    return end==0;
  }
  public int remove(){
    int removingData=0;
    if(size()==0){
      throw new EmptyStackException();
    }else{
       removingData=queue[start];
      queue[start]= 0;
      start++;size--;
    }return removingData;
  }
  public void printall(){
    for(int i = start;i<end;i++){
      System.out.println(queue[i]);
    }
  }
}