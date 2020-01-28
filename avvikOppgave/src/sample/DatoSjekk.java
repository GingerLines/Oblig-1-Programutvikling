package sample;

public class DatoSjekk {
    public static String sjekk (int dag, int måned, int år) throws invalidDate{
        if (dag<1 || dag>31){
            throw new invalidDate("Dagen må være et heltall mellom 1 og 31.");
        }
        else if (måned<1 || måned>12){
            throw new invalidDate("Måneden må være et heltall mellom 1 og 12.");
        }
        else if (år<1900 || år>2020){
            throw new invalidDate("Året må være et heltall mellom 1900 og 2020.");
        }
        else{
            return dag + "." + måned + "." + år;
        }
    }
}
