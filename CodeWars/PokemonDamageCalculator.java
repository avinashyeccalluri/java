/**
 * PokemonDamageCalculator
 */
public class PokemonDamageCalculator {

    public static void main(String[] args) {
        System.out.println(calculator("fire", "electric", 10, 2));
    }
    public static int calculator(String yourType,String opponentType,int attack,int defence){
        double effectiveness=0;
        if(yourType=="fire" && opponentType=="grass"){
            effectiveness=2;
        }
        else if(yourType=="fire" && opponentType=="water"){
            effectiveness=0.5
            ;
        }
        else if(yourType=="fire" && opponentType=="electric"){
            effectiveness=1;
        }
        else if(yourType=="water" && opponentType=="grass"){
            effectiveness=0.5;
        }
        else if(yourType=="water" && opponentType=="electric"){
            effectiveness=2;
        }else{
            effectiveness=1;
        }
        return (int) (50*(attack/defence)*effectiveness);
    }
}