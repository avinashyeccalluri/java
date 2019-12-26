package MasteringDataStructures.DoublyLinkedList;

/**
 * Node
 */
public class Node {

    Integer data;
    Node previous;
    Node next;

    public Node getNext() {
        return this.next;
    }
    public void setNext(Node next) {
        this.next = next;
    }


    public Node getPrevious() {
        return this.previous;
    }
    public void setPrevious(Node previous) {
        this.previous = previous;
    }


    public Node(int data){
        this.data=data;
    }

    public String toString(){
        return data.toString();
    }


}