/**
 * GroupAnagram
 */import java.util.*;
public class GroupAnagram {

    public static void main(String[] args) {
        groupAnagrams(new String[] {"eat", "tea", "tan", "ate", "nat", "bat"});
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();
        for(int i =0;i<strs.length;i++){
            char[] characters=strs[i].toCharArray();
            Arrays.sort(characters);
            String comparing=new String(characters);
            List<String> arraylist=map.get(comparing);
            if(arraylist==null){
                arraylist=new ArrayList<String>();
            }arraylist.add(strs[i]);
            map.put(comparing, arraylist);
            
        }return new ArrayList<List<String>>(map.values());
    }
}