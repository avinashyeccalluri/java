package MasteringDataStructures.HashTable;

/**
 * SimpleHashTable
 */
public class SimpleHashTable {
  private StoredEmployee[] hashtable;
  public SimpleHashTable(){
      hashtable=new StoredEmployee[10];
  }
<<<<<<< HEAD
=======

  public void remove(String key){
    int hashkey=findKey(key);
    if(hashkey==-1){
      return ;
    }hashtable[hashkey]=null;
    
  }

>>>>>>> 574eedef554561c3182b7b6a263f18a39f952d46
  private int hashedKey(String key){
    return key.length()%hashtable.length;
  }
  void put(String key,Employee employee){
    int hashkey=hashedKey(key);
    if(occupied(hashkey)){
      int stopIndex=hashkey;
      if(hashkey==hashtable.length-1){
        hashkey=0;
      }else{
        hashkey++;
      }
      while (occupied(hashkey) && stopIndex!=hashkey) {{
        hashkey=(hashkey+1)%hashtable.length;
      }        
      }
    }
    if(occupied(hashkey)){
      System.out.println("The position is occupied");
    }else{
      hashtable[hashkey]=new StoredEmployee(key, employee);
    }
  }
  public Employee get(String key){
    int hashkey=findKey(key);
    if(hashkey==-1){
      return null;
    }return hashtable[hashkey].employee;
  }
  public int findKey(String key){
    int hashkey=hashedKey(key);
    if(hashtable[hashkey]!=null && hashtable[hashkey].key.equals(key)){
      return hashkey;
    }
    int stopIndex=hashkey;
      if(hashkey==hashtable.length-1){
        hashkey=0;
      }else{
        hashkey++;
      }
      while (hashtable[hashkey]!=null && hashkey!=stopIndex && !hashtable[hashkey].key.equals(key)){
        hashkey=(hashkey+1)%hashtable.length;
      }
      if(hashtable[hashkey]!=null & hashtable[hashkey].key.equals(key)){
        return hashkey;
      }return -1;
      }
  public void printAll(){
    for(int i =0;i<hashtable.length;i++){
      if(hashtable[i]==null){
        System.out.println("Empty");
      }else{
      System.out.println(hashtable[i].employee);}
    }
  }

  private boolean occupied(int index){
    return hashtable[index]!=null;
  }

}