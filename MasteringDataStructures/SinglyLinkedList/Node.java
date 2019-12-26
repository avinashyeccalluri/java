package MasteringDataStructures.SinglyLinkedList;

/**
 * Node
 */
public class Node {

    Integer data;
    Node next;

public Node getNext() {
	return this.next;
}
public void setNext(Node next) {
	this.next = next;
}


public int getData() {
	return this.data;
}
public void setData(int data) {
	this.data = data;
}


public Node(int data){
    this.data=data;
    }
    
    public String toString() {
        return data.toString();
    }   
}