import java.util.ArrayList;

/**
 * FlamesConcept
 */
public class FlamesConcept {

  public static void main(String[] args) {
    System.out.println(josephusSurvivor(7, 3));
    
  }
  public static int josephusSurvivor(final int n, final int k) {
    ArrayList<Integer> list=new ArrayList<>();
    for(int i=1;i<=n;i++){
      list.add(i);
    }
    int index=k-1;
    int last=0;
    while(list.size()>1){
      if(index<list.size()){
        list.remove(index);
        index+=k-1;
      }else{
        index=index-list.size();
      }
    }    
    for(int i:list){
      last=i;
    }
    return last;
  }  
}