package MasteringLinkedList.DoublyLinkedList;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        DoubleLinkedList list=new DoubleLinkedList();
        list.addtoFront(10);
        list.addtoFront(11);
        list.addtoFront(12);
        list.addtoFront(13);
        list.addtoEnd(14);
        list.printAll();
        System.out.println("---------------");
        list.deleteAtEnd();
        list.printAll();
        System.out.println("----------------");
        list.deleteAtStart();
        list.printAll();
        System.out.println("The head is "+list.head);
        System.out.println("----------");
        list.AddAtSpecificPoint(13, 1);
        list.printAll();
        System.out.println("The head is "+list.head);
        System.out.println("--------------------");
        list.deleteAtSpecificPoint(1);
        list.printAll();
    }
}