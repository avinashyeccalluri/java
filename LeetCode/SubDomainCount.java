package LeetCode;
import java.util.*;
/**
 * SubDomainCount
 */
public class SubDomainCount {

    public static void main(String[] args) {
        System.out.println(subdomainVisits(new String[] {"cool","lock","cook"}));
    }
    public static List<String> subdomainVisits(String[] cpdomains) {
        ArrayList<String> arrli = new ArrayList<String>(); 
        Map< Character,Integer> hm =new HashMap< Character,Integer>();
        int i=0;
        for(int j=0;j<cpdomains[1].length();j++){
            if(cpdomains[i].charAt(j)==cpdomains[i+1].charAt(j)){
                    if(hm.containsKey(cpdomains[i].charAt(j))){
                        hm.put(cpdomains[i].charAt(j),hm.get(cpdomains[i].charAt(j))+1);
                    }else{
                        hm.put(cpdomains[i].charAt(j),1);
                    }
            }
        }
        if(cpdomains.length>1){
        for(i=2;i<cpdomains.length;i++){
            for(int j=0;j<cpdomains[1].length();j++){
                if(hm.containsKey(cpdomains[i].charAt(j))){
                    hm.put(cpdomains[i].charAt(j),hm.get(cpdomains[i].charAt(j))+1);
                }
            }
        }
    }
        return arrli;
        
    }
}