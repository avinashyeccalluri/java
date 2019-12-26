package MasteringDataStructures.CircularQueue;

/**
 * Main
 */
public class Main {

  public static void main(String[] args) {
    CircularQueue queue=new CircularQueue();
    queue.add(0);
    queue.add(21);
    queue.add(22);
    queue.add(23);
    queue.add(24);
    queue.add(25);
    queue.add(26);
    queue.add(27);
    queue.add(28);
    queue.add(12);
    queue.add(12);
    queue.add(12);
    queue.add(12);
    queue.remove();
    // queue.print();
    // queue.add(12);
    queue.print();
    System.out.println(queue.size());
  }
}