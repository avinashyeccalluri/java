package Practising.IntegerLinkedList;

/**
 * Linkedlist
 */
public class Linkedlist {
  Node head;
  int size;
  public void addtoFront(int data){
      Node addingfront=new Node(data);
      addingfront.setNext(head);
      head=addingfront;
      size++;
      }
  public int size(){
    return size;
  }
  public boolean isEmpty(){
    return head==null;
  }
  public Node deleteatFront(){
    Node deletingatFront=head;
    head=head.getNext();
    return head;
  }

  public void printall(){
    Node print=head;
    while(print!=null){
      System.out.println(print);
      print=print.getNext();
    }

  }
}