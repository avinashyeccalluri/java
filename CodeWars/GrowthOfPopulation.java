/**
 * GrowthOfPopulation
 */ package CodeWars;
public class GrowthOfPopulation {

    public static void main(String[] args) {
        System.out.println(nbYear(1000, 2, 50, 1200));        
    }
    public static int nbYear(int p0, double percent, int aug, int p) {
        int years = 0;
        while (p0 < p) {
            p0 += p0 * percent / 100 + aug;
            years++;
        }
        return years;
    }
}