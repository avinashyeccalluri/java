package MasteringDataStructures.HashTable;

/**
 * Main
 */
public class Main {

  public static void main(String[] args) {
    Employee janeJones=new Employee("jane","Jones",123);
    Employee johnDoe= new Employee ("John","Doe",4567);
    Employee marySmith=new Employee("Mary","Smith",22);
    Employee mikeWilson=new Employee("Mike","Wilson",3245);
    Employee billEnd= new Employee("Bill","End",78);

    SimpleHashTable HT=new SimpleHashTable();
    HT.put("Jones",janeJones);
    HT.put("Dow",johnDoe);
    HT.put("Wilson",mikeWilson);
    HT.put("Smith",marySmith);

    HT.printAll();System.out.println("----------------------------------");
    HT.remove("Wilson");
    HT.printAll();

    // System.out.println("Retriving Key Wilson "+ HT.get("Wilson"));
    // System.out.println("Retriving Key Wilson "+ HT.get("Smith"));
  }
}