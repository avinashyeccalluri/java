package MasteringDataStructures.HashTable;

/**
 * SimpleHashTable
 */
public class SimpleHashTable {

  private Employee[] hashtable;
  public SimpleHashTable(){
      hashtable=new Employee[10];
  }

  private int hashedKey(String key){
    return key.length()%hashtable.length;
  }

  void put(String key,Employee employee){
    int hashkey=hashedKey(key);
    if(hashtable[hashkey]!=null){
      System.out.println("The position is occupied");
    }else{
      hashtable[hashkey]=employee;
    }
  }

  public Employee get(String value){
    int hashkey=hashedKey(value);
    return hashtable[hashkey];
  }

  public void printAll(){
    for(int i =0;i<hashtable.length;i++){
      System.out.println(hashtable[i]);
    }
  }

}