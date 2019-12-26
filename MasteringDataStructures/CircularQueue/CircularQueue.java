package MasteringDataStructures.CircularQueue;

import java.util.EmptyStackException;

/**
 * CircularQueue
 */
public class CircularQueue {

  int front;
  int end;
  int size;
  int[] queue;
  public CircularQueue(){
    queue=new int[10];
  }
  public void add(int data){
    int a=size();
    int b=queue.length;
    if(size()==queue.length){
      int someSize=size();
      int[] newArray=new int[2*queue.length];
      System.arraycopy(queue, front, newArray, 0, queue.length-front);
      System.arraycopy(queue,0,newArray,queue.length-front,end);
      queue=newArray;
      front=0;
      end=someSize;
    }
    if(end==queue.length){
      end=0;
    }else{
      queue[end]=data;
      end++;
    }
  }
  public int size(){
    if(front<=end){
      return end-front;
    }return end-front+queue.length;
  }
  public int peek(){
    return queue[end];
  }
  public boolean isEmpty(){
    return size()==0;
  }

  public int remove(){
    if(size()==0){
      throw new EmptyStackException();
    }
    int removingData=queue[front];
    queue[front]=9999;front++;
    if(size()==0){
      front=0;end=0;
    }    
    else if(front==queue.length){
      front=0;
    }
    
    return removingData;
  }
  public void print(){
    if(front<=end){
        for(int i=front;i<end;i++){
          System.out.println(queue[i]);
        }
    }else{
      for(int i = front;i<queue.length;i++){
        System.out.println(queue[i]);
      }
      for(int j =0;j<end;j++){
        System.out.println(queue[j]);
      }
    }
  }
}