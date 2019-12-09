package Practising.IntegerLinkedList;

/**
 * Node
 */
public class Node {
  private int data;
  Node next;

  public int getData() {
    return this.data;
  }

  public void setData(int data) {
    this.data = data;
  }

  public Node getNext() {
    return this.next;
  }

  public void setNext(Node next) {
    this.next = next;
  }

  public Node(int data){
    this.data=data;
  }
  public String toString()  {
    return "data->"+data;
  }
}