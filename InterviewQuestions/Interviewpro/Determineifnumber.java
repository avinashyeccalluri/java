package InterviewQuestions.Interviewpro;

/**
 * Determineifnumber
 */
public class Determineifnumber {

    public static void main(String[] args) {
        String something="22e12";
        String name=something.toUpperCase();
        System.out.println(Float.parseFloat(name));
        try{
            int a =Integer.parseInt(name);
            if(a>0){
                System.out.println("It's a postive integer");
            }else{
                System.out.println("It's a Negative integer");
            }
        }catch(Exception e){
            try{
            float b=Float.parseFloat(name);
            if(b>0){
                System.out.println("It's a postive float");
            }else{
                System.out.println("It's a Negative float");
            }
        }catch(Exception e1){
            
            if(name.indexOf("E")>0){
                System.out.println("it might be a exponential number");
                int a =name.indexOf("E");
                String value=name.substring(a+1);
                System.out.println("The value is ----->"+value);
            }else{
                System.err.println("something went wrong");
            }
        }
    }
    }
}