package MasteringLinkedList.SinglyLinkedList;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        SingleLinkedList list=new SingleLinkedList();

        list.addtoEnd(12);
        list.addtoEnd(13);
        list.addtoEnd(14);
        list.addtoFront(11);
        list.printAll();
        System.out.println("-------------");
        list.deleteatPosition(3);
        list.printAll();
    }
}