/**
 * practising
//  */
// s1 = "6900690040"
// s2 = "4690606946"
// s3 = "9990494604"
public class practising {

  public static void main(String[] args) {
    String a="444996, 699990, 666690, 096904, 600644, 640646, 606469, 409694, 666094, 606490";
    String[] b=a.split(", ");
    int count=0;
    for(int i=0;i<b.length-1;i++){
      // System.out.println(i);
      for(int j=0;j<b[i].length();j++){
        if(b[i].charAt(j)==b[i+1].charAt(j)){
          count++;
        }
      }
    }
    for(int i =0;i<b[1].length();i++){
      if(b[0].charAt(i)==b[b.length-1].charAt(i)){
        count++;
      }
    }
    double as=count*100;
    // System.out.println(String.format("%.10g%n", (double)(as)/(double)(b.length*b[0].length())));
    System.out.println((double)(as)/(double)(b.length*b[0].length()));
    // System.out.println(count);
    // System.out.println((b.length*b[0].length()));
  }
}