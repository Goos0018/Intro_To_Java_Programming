package be.vdab.chapter1;

public class Excercice_01_11 {
    public static void main(String[] args) {

        int startPopulation = 312032486;
        int fiveYearPopulation = 0;
        int years = 5;
        int days = 365;
        int hours = 24;
        int minutes = 60;
        int seconds = 60;

        double births = 0;
        double deaths = 0;
        double imigrants = 0;

        births = (years * days * hours * minutes * seconds)/7.0;
        deaths = (years * days * hours * minutes * seconds)/13.0;
        imigrants = (years * days * hours * minutes * seconds)/45.0;

        System.out.println("births "+ births + "  deaths " + deaths + "  imigrants " + imigrants );
        fiveYearPopulation = (int) (startPopulation + births + imigrants - deaths);
        System.out.println("In 5 years the US population will be" + fiveYearPopulation);

    }
}
