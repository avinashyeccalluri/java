package MasteringLinkedList.DoublyLinkedList;

/**
 * DoubleLinkedList
 */
public class DoubleLinkedList {

    Node head;
    Node tail;
    int size;

    public void addtoFront(int data){
        Node node=new Node(data);
        if(head==null){
            tail=node;
        }
        else{
            node.setNext(head);
            head.setPrevious(node);
        }head=node;size++;
    }
    public void addtoEnd(int data){
        Node node=new Node(data);
        if(tail==null){
            head=node;
        }else{
            tail.setNext(node);
            node.setPrevious(tail);

        }tail=node;
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public void printAll(){
        Node starting=head;
        while(starting!=null){
            System.out.println(starting);
            starting=starting.getNext();
        }
    }
    public void deleteAtStart(){
        Node heading=head;
        if(isEmpty()){
            return ;
        }
        if(heading.getNext()==null){
            head=null;
            tail=null;
        }else{
            head.getNext().setPrevious(null);
        }head=head.getNext();
    }
    public void deleteAtEnd(){
        Node tailing=tail;
        if(tail==null){
            return ;
        }
        if(tail.getPrevious()==null){
            head=null;
            tail=null;
        }else{
            tail.getPrevious().setNext(null);
        }tail=tail.getPrevious();
    }
    public void AddAtSpecificPoint(int data,int position){
        Node node=new Node(data);
        Node heading=head;
        int count=0;
        Node previous=null;
        while(count!=position){
            previous=heading;
            heading=head.getNext();
            count++;
        }
        previous.setNext(node);
        if(count==0){
            head=node;
        }else{
            node.setPrevious(previous);
            node.setNext(heading);
        }
    }
    public void deleteAtSpecificPoint(int position){
        int count=0;
        Node heading=head;
        Node previous=null;
        while(count!=position){
            previous=heading;
            heading=heading.getNext();count++;
        }
        if(count==0){
            head=head.getNext();
        }else{
            heading=heading.getNext();
            previous.setNext(heading);
            heading.setPrevious(previous);
        }
    }

}