package CodeWars;

/**
 * backSpace
 */
public class backSpace {

  public static void main(String[] args) {
    System.out.println(cleanString("#abc"));
  }
  public static String cleanString(String input){
    int z=-1;if(input.charAt(0)=='#'){z=23;}
    String result=input;
    int count=0;    
    for(int i=0;i<input.length();i++){
      if(input.charAt(i)=='#'){
        count++;
      }}if(count==input.length()){return "";}
      while(result.length()!=result.length()-(2*count)){
        int j;
        for( j=0;j<input.length();j++){
          if(input.charAt(j)=='#'){
            input=input.substring(0,j-1);
            input+=result.substring(j+1);
            result=input;j=0;continue;
          }
        }
        if(z==23) return '#'+input;return input;
      }    
    return "";
  }
}