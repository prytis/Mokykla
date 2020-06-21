package mokykla;

import java.util.Arrays;

public abstract class Mokinys {

    String vardas;
    String pavarde;
    int klase;
    String lytis;
    int vidurkis;
    int[] pazymiai;


    public void printMokinys() {

        System.out.println(this.vardas + " "
                + this.pavarde + " " +
                this.klase + " " +
                this.lytis + " " +
                Arrays.toString(this.pazymiai)+ " "+
                this.vidurkis);


    }
}

