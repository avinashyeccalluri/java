/**
 * ClerkChange
 */package CodeWars;
public class ClerkChange {

    public static void main(String[] args) {
        int[] changeArray={25, 25, 50};
        Tickets(changeArray);
        System.out.println(Tickets(changeArray));
    }
    public static String Tickets(int[] peopleInLine)
    {
        int availableChange=0;
    //    {25,25,50}
    //{25, 25, 50, 50, 100}
    for (int i : peopleInLine) {
        if(i==25){
            availableChange+=i;
        }
        else{
            if(availableChange-(i-25)<0){
                return "NO";                 
            }else if (availableChange>(i-25)){
                availableChange=availableChange-(i-25);
            }
        }
    }return "YES";
    }
}