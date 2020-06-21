package mokykla;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Mokykla {

    public static void main(String[] args) {

        List<Mokinys> mokiniai = new ArrayList<>();

        for (int i=0; i<31;i++) {
            mokiniai.add(new getPerson());
            System.out.println(mokiniai.get(i).vardas+" "
                    +mokiniai.get(i).pavarde+" "+
                    mokiniai.get(i).klase+" "+
                    mokiniai.get(i).lytis+" "+
                    Arrays.toString(mokiniai.get(i).pazymiai));
        }


        Collections.sort(mokiniai, new SortByKlase(0));



        System.out.println("Sorted-----------------------------------");
        for (int i=0; i<31;i++) {
            System.out.println(mokiniai.get(i).vardas+" "
                    +mokiniai.get(i).pavarde+" "+
                    mokiniai.get(i).klase+" "+
                    mokiniai.get(i).lytis+" "+
                    Arrays.toString(mokiniai.get(i).pazymiai)+ " "+
                    mokiniai.get(i).vidurkis);
        }
        System.out.println("Paskutinis mokinys:");
        Collections.sort(mokiniai, new PaskutinisMokinys());
        System.out.println(mokiniai.get(30).vardas+" "
                +mokiniai.get(30).pavarde+" "+
                mokiniai.get(30).klase+" "+
                mokiniai.get(30).lytis+" "+
                Arrays.toString(mokiniai.get(30).pazymiai)+ " "+
                mokiniai.get(30).vidurkis);

        System.out.println("Trys geriausi mokiniai:");
        for (int i=0; i<3;i++) {
            System.out.println(mokiniai.get(i).vardas+" "
                    +mokiniai.get(i).pavarde+" "+
                    mokiniai.get(i).klase+" "+
                    mokiniai.get(i).lytis+" "+
                    Arrays.toString(mokiniai.get(i).pazymiai)+ " "+
                    mokiniai.get(i).vidurkis);
        }

    }
}
