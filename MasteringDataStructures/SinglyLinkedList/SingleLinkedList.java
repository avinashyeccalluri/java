package MasteringDataStructures.SinglyLinkedList;

/**
 * SingleLinkedList
 */
public class SingleLinkedList {

    Node head;
    Node tail;
    int size;
    public void addtoFront(int data){
        Node node=new Node(data);
        if(head==null){
            tail=node;
        }else{
            node.setNext(head);
        }head=node;
        size++;
    }
    public void addtoEnd(int data){
        Node node=new Node(data);
        Node addendElement=head;
        if(tail==null){
            head=node;
        }else{
            while(addendElement.getNext()!=null){
                addendElement=addendElement.getNext();
            }
            addendElement.setNext(node);
        addendElement.getNext().setNext(null);
        }tail=node;size++;
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size==0;
    }

    public Node removefromStart(){
        Node removingItem=head;
        if(head==null){
            return null;
        }else{
            head=head.getNext();

        }size--;
        return removingItem;
    }
    public void removefromEnd(){
        Node removingItem=head;
        if(head==null){
            return ;
        }else{
            while(removingItem.next!=tail){
                removingItem=removingItem.getNext();
            }
            tail=removingItem;size--;
            tail.setNext(null);
        }
    }
    public void printAll(){
        Node printHead=head;
        while(printHead!=null){
            System.out.println(printHead.toString());
            printHead=printHead.getNext();
        }
    }
    public Node head(){
        return head;
    }
    public void addtoPosition(int data,int position){
        Node prev=null;
        Node newElement=new Node(data);
        Node heading=head;
        int count=0;        
        while(count!=position){
            prev=heading;
            heading=heading.getNext(); count++;           
        }
        newElement.setNext(heading);
        if(count==0){
            head=newElement;
        }else{
            prev.setNext(newElement);
        }
    }
    public void deleteatPosition(int position){
        Node heading=head;
        Node prev=null;
        int count=0;
        while(count!=position){
            count++;
            prev=heading;
            heading=heading.getNext();
        }
        if(count==0){
            head=head.getNext();
        }else{
        heading=heading.getNext();
        prev.setNext(heading);}
    }
}