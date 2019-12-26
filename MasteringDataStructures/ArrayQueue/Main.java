package MasteringDataStructures.ArrayQueue;

/**
 * Main
 */
public class Main {

  public static void main(String[] args) {
    ArrayQueue queue=new ArrayQueue();
    queue.add(10);
    queue.add(11);
    queue.add(12);
    queue.printall();
    System.out.println("--------------");
    queue.remove();
    queue.remove();
    queue.printall();
  }
}