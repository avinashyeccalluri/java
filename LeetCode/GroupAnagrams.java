package LeetCode;
import java.util.*;
/**
 * GroupAnagrams
 */
public class GroupAnagrams {

    public static void main(String[] args) {
        groupAnagrams(new String[] {"eat", "tea", "tan", "ate", "nat", "bat"});
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(int i = 0;i < strs.length;i++){
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            List<String> list = map.get(sorted);
            if(list == null)
                list = new ArrayList<String>();
            list.add(strs[i]);
            map.put(sorted, list);
        }
        return new ArrayList<List<String>>(map.values());
    }
}